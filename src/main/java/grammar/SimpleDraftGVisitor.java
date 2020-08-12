// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleDraftG.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleDraftGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleDraftGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleDraftGParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleDraftGParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleDraftGParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#sysfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysfunc(SimpleDraftGParser.SysfuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignString(SimpleDraftGParser.AssignStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDigits(SimpleDraftGParser.AssignDigitsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignObjArray}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignObjArray(SimpleDraftGParser.AssignObjArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVarString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVarString(SimpleDraftGParser.AssignVarStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVarDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVarDigits(SimpleDraftGParser.AssignVarDigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(SimpleDraftGParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(SimpleDraftGParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SimpleDraftGParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SimpleDraftGParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(SimpleDraftGParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthancompare(SimpleDraftGParser.LessthancompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(SimpleDraftGParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdend(SimpleDraftGParser.IdendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorethancompare(SimpleDraftGParser.MorethancompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntend(SimpleDraftGParser.IntendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(SimpleDraftGParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondequality(SimpleDraftGParser.CondequalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondint(SimpleDraftGParser.CondintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondid(SimpleDraftGParser.CondidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondmultdiv(SimpleDraftGParser.CondmultdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondlessgreater(SimpleDraftGParser.CondlessgreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondplusminus(SimpleDraftGParser.CondplusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#arrvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrvalue(SimpleDraftGParser.ArrvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleDraftGParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SimpleDraftGParser.CommentContext ctx);
}