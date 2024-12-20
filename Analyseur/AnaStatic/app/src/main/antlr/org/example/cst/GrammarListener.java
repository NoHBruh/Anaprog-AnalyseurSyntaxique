// Generated from Grammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(GrammarParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(GrammarParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void enterStmtlist(GrammarParser.StmtlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void exitStmtlist(GrammarParser.StmtlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(GrammarParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(GrammarParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(GrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(GrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(GrammarParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithexpr(GrammarParser.ArithexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithexpr(GrammarParser.ArithexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(GrammarParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(GrammarParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(GrammarParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(GrammarParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(GrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(GrammarParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#noprnd}.
	 * @param ctx the parse tree
	 */
	void enterNoprnd(GrammarParser.NoprndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#noprnd}.
	 * @param ctx the parse tree
	 */
	void exitNoprnd(GrammarParser.NoprndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boprnd}.
	 * @param ctx the parse tree
	 */
	void enterBoprnd(GrammarParser.BoprndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boprnd}.
	 * @param ctx the parse tree
	 */
	void exitBoprnd(GrammarParser.BoprndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rop}.
	 * @param ctx the parse tree
	 */
	void enterRop(GrammarParser.RopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rop}.
	 * @param ctx the parse tree
	 */
	void exitRop(GrammarParser.RopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(GrammarParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(GrammarParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GrammarParser.ArrayContext ctx);
}