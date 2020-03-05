package test;// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleGParser}.
 */
public interface SimpleGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleGParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleGParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleGParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleGParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleGParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleGParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleGParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleGParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(SimpleGParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(SimpleGParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(SimpleGParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(SimpleGParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleGParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterConditon(SimpleGParser.ConditonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitConditon(SimpleGParser.ConditonContext ctx);
}