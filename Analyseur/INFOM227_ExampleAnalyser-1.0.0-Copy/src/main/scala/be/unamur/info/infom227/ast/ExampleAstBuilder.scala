package be.unamur.info.infom227.ast

import be.unamur.info.infom227.cst.{ExampleGrammarBaseVisitor, ExampleGrammarParser}
import be.unamur.info.infom227.util.TryIterator.*

import scala.jdk.CollectionConverters.*
import scala.util.{Failure, Success, Try}

object ExampleAstBuilder {
  def build(programCst: ExampleGrammarParser.ProgramContext, symbolTable: Option[ExampleSymbolTable] = None): Try[ExampleProgram] = {
    ExampleAstBuilder(symbolTable).visitProgram(programCst)
  }

}

private class ExampleAstBuilder(private var symbolTable: Option[ExampleSymbolTable] = None) extends ExampleGrammarBaseVisitor[Try[ExampleSequence | ExampleStatement | ExampleExpression | ExampleType]] {

  private def withScope[T](function: ExampleSymbolTable => Try[T]): Try[T] = {
    symbolTable match
    case Some(symbolTable)
    => function(symbolTable)
    case None => Failure(MissingContextException("No symbol table", null, null))
  }

  private def newScope[T](function: ExampleSymbolTable => Try[T]): Try[T] = {
    val oldSymbolTable = symbolTable
    symbolTable = Some(ExampleSymbolTable(oldSymbolTable))
    val result = withScope(function)
    symbolTable = oldSymbolTable
    result
  }

  // Programs

  override def visitProgram(ctx: ExampleGrammarParser.ProgramContext): Try[ExampleProgram] = {
    for {
      functionDeclaration <- newScope(_ => visitFunctionDeclaration(ctx.functiondeclaration))
    } yield ExampleProgram(functionDeclaration)
  }

  override def visitFunctionDeclaration(ctx: ExampleGrammarParser.FunctionDeclarationContext): Try[ExampleFunctionDeclaration] = {
    for {
      paramlist <- visiteParamList(ctx.paramlist)
      stmtlist <- visiteStmtList(ctx.stmtlist)
    } yield ExampleScope(paramlist.params ++ stmtlist.stmts *)
  }

  override def visitParamListParam(ctx: ExampleGrammarParser.ParamListParamContext): Try[ExampleParamListParam] = {
    for{
      params <- visiteParam(ctx.param)

    } yield ExampleParamListParam(params.param *)
  }

  override def visiteParamListList(ctx: ExampleGrammarParser.ParamListListContext): Try[ExampleParamListList] = {
    for{
      params <- visitParam(ctx.param)
      paramslist <- visitParamListList(ctx.paramlist)
    } yield ExampleParamListList(params.param ++ paramslist.param)
  }

  override def visitParam(ctx: ExampleGrammarParser.ParamContext): Try[ExampleParam] = {
    if (ctx.ID != null) {
      Success(ID)
    } else {
      Failure(UnsupportedRuleException(s"No ID : ${ctx.getText}", ctx, null))
    }
  }

  override def visitStmtSolo(ctx: ExampleGrammarParser.StmtSoloContext): Try[ExampleStmtSolo] = {
    for{
      stmts <- visitStmt(ctx.stmt)
    } yield ExampleStmtSolo(stmts.stmt)
  }

  override def visitStmtAndList(ctx: ExampleGrammarParser.StmtAndListContext): Try[ExampleStmtAndList] = {
    for {
      stmts <- visitStmt(ctx.stmt)
      stmtlist <- visitStmtList(ctx.stmtlist)
    } yield ExampleStmtAndList(stmts.stmt ++ stmtlist.toString)
  }

  override def visitStmt(ctx: ExampleGrammarParser.StmtContext): Try[ExampleStmt] = {
    if (ctx.assignment != null) {
      visitAssignment(ctx.assignment)
    } else if (ctx.ifstmt != null) {
      visitIf(ctx.ifstmt)
    } else if (ctx.whilestmt != null) {
      visitWhile(ctx.whilestmt)
    } else if (ctx.sequencestmt != null) {
      visitSequenceStmt(ctx.sequencestmt)
    } else if (ctx.returnstmt != null) {
      visitReturnStmt(ctx.returnstmt)
    }else {
      Failure(UnsupportedRuleException(s"Unsupported statement : ${ctx.getText}", ctx, null))
    }
  }

  override def visitAssignment(ctx: ExampleGrammarParser.AssignmentContext): Try[ExampleAssignment] = {
    val name = ctx.ID.getText
    if (ctx.expr != null) {
      withScope(symbolTable =>
        for {
          exampleType <- symbolTable.get(name, false)
          (expression, scope) <- if (ctx.scope != null) {
            newScope(_ =>
              for {
                scope <- visitScope(ctx.scope)
                expression <- visitExpr(ctx.expr)
              } yield (expression, scope)
            )
          } else {
            for {
              expression <- visitExpr(ctx.expr)
            } yield (expression, ExampleScope())
          }
          //pas de success car pas de match type
        } yield ExampleAssignment(ctx.getStart.getLine, name, scope, expression)
      )
    } else if (ctx.funccall != null) {
      withScope(symbolTable =>
        for {
          exampleType <- symbolTable.get(name, false)
          (expression, scope) <- if (ctx.scope != null) {
            newScope(_ =>
              for {
                scope <- visitScope(ctx.scope)
                expression <- visitFuncCall(ctx.funccall)
              } yield (expression, scope)
            )
          } else {
            for {
              expression <- visitFuncCall(ctx.funccall)
            } yield (expression, ExampleScope())
          }
          //pas de success car pas de match type
        } yield ExampleAssignment(ctx.getStart.getLine, name, scope, expression)
      )
    } else {
      withScope(symbolTable =>
        for {
          exampleType <- symbolTable.get(name, false)
          (expression, scope) <- if (ctx.scope != null) {
            newScope(_ =>
              for {
                scope <- visitScope(ctx.scope)
                expression <- visitArray(ctx.array)
              } yield (expression, scope)
            )
          } else {
            for {
              expression <- visitArray(ctx.array)
            } yield (expression, ExampleScope())
          }
          //pas de success car pas de match type
        } yield ExampleAssignment(ctx.getStart.getLine, name, scope, expression)
      )
    }
  }

  override def visitFuncCall(ctx: ExampleGrammarParser.FuncCallContext): Try[ExampleFuncCall] = {
    for {
      expression <- visitExprList(ctx.exprlist)
    } yield ExampleFuncCall(ctx.getStart.getLine, expression)
  }

  override def visitIfStmt(ctx: ExampleGrammarParser.IfStmtContext): Try[ExampleIfStmt] = {
    for {
      condition <- visitExpr(ctx.expr).flatMap {
        case expression: ExampleBoolExpr => Success(expression)
        case _ => Failure(CannotBuildAstException(s"If condition ${ctx.expression.getText} is not a boolean", ctx, null))
      }
      ifStatements <- visitStmt(ctx.stmt(0))
      elseStatements <- visitStmt(ctx.stmt(1))
    } yield ExampleIfStmt(ctx.getStart.getLine, condition, ifStatements, elseStatements)
  }

  override def visitWhileStmt(ctx: ExampleGrammarParser.WhileStmtContext): Try[ExampleWhileStmt] = {
    for {
      condition <- visitExpr(ctx.expr).flatMap {
        case expression: ExampleBoolExpr => Success(expression)
        case _ => Failure(CannotBuildAstException(s"While condition ${ctx.expression.getText} is not a boolean", ctx, null))
      }
      statements <- visitStmt(ctx.stmt)
    } yield ExampleWhileStatement(ctx.getStart.getLine, condition, statements)
  }

}





