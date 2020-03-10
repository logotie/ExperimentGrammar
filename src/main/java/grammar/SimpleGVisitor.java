// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
package grammar;
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
	 * Visit a parse tree produced by {@link SimpleGParser#sysfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysfunc(SimpleGParser.SysfuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignstringmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstringmutablesingletype(SimpleGParser.AssignstringmutablesingletypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigndigitsmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigndigitsmutablesingletype(SimpleGParser.AssigndigitsmutablesingletypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignstringmutablechangetype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstringmutablechangetype(SimpleGParser.AssignstringmutablechangetypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmutable(SimpleGParser.AssignmutableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignstringnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstringnonmutable(SimpleGParser.AssignstringnonmutableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigndigitsnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigndigitsnonmutable(SimpleGParser.AssigndigitsnonmutableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigntextnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigntextnonmutable(SimpleGParser.AssigntextnonmutableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraymutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraymutableassign(SimpleGParser.ArraymutableassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraynonmutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraynonmutableassign(SimpleGParser.ArraynonmutableassignContext ctx);
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
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SimpleGParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SimpleGParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(SimpleGParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthancompare(SimpleGParser.LessthancompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(SimpleGParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdend(SimpleGParser.IdendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorethancompare(SimpleGParser.MorethancompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntend(SimpleGParser.IntendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(SimpleGParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondequality(SimpleGParser.CondequalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondint(SimpleGParser.CondintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondid(SimpleGParser.CondidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondmultdiv(SimpleGParser.CondmultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondlessgreater(SimpleGParser.CondlessgreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondplusminus(SimpleGParser.CondplusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#arrvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrvalue(SimpleGParser.ArrvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SimpleGParser.CommentContext ctx);
}