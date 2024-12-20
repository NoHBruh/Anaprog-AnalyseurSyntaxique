// Generated from Grammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(GrammarParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmtlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtlist(GrammarParser.StmtlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(GrammarParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GrammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithexpr(GrammarParser.ArithexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(GrammarParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(GrammarParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(GrammarParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#noprnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoprnd(GrammarParser.NoprndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boprnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoprnd(GrammarParser.BoprndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(GrammarParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRop(GrammarParser.RopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(GrammarParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GrammarParser.ArrayContext ctx);
}