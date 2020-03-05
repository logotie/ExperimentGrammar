package test;// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleGParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleGParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleGParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleGParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(SimpleGParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(SimpleGParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleGParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditon(SimpleGParser.ConditonContext ctx);
}