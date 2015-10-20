// Generated from LabeledExpr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(LabeledExprParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(LabeledExprParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LabeledExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LabeledExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LabeledExprParser.ExprContext ctx);
}