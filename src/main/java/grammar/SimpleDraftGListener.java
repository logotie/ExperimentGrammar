// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleDraftG.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleDraftGParser}.
 */
public interface SimpleDraftGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleDraftGParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleDraftGParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleDraftGParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleDraftGParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleDraftGParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleDraftGParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#sysfunc}.
	 * @param ctx the parse tree
	 */
	void enterSysfunc(SimpleDraftGParser.SysfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#sysfunc}.
	 * @param ctx the parse tree
	 */
	void exitSysfunc(SimpleDraftGParser.SysfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignString(SimpleDraftGParser.AssignStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignString(SimpleDraftGParser.AssignStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignDigits(SimpleDraftGParser.AssignDigitsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignDigits(SimpleDraftGParser.AssignDigitsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignObjArray}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignObjArray(SimpleDraftGParser.AssignObjArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignObjArray}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignObjArray(SimpleDraftGParser.AssignObjArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVarString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVarString(SimpleDraftGParser.AssignVarStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVarString}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVarString(SimpleDraftGParser.AssignVarStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVarDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVarDigits(SimpleDraftGParser.AssignVarDigitsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVarDigits}
	 * labeled alternative in {@link SimpleDraftGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVarDigits(SimpleDraftGParser.AssignVarDigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(SimpleDraftGParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(SimpleDraftGParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(SimpleDraftGParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(SimpleDraftGParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SimpleDraftGParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SimpleDraftGParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SimpleDraftGParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SimpleDraftGParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(SimpleDraftGParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(SimpleDraftGParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessthancompare(SimpleDraftGParser.LessthancompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessthancompare(SimpleDraftGParser.LessthancompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(SimpleDraftGParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(SimpleDraftGParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdend(SimpleDraftGParser.IdendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdend(SimpleDraftGParser.IdendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMorethancompare(SimpleDraftGParser.MorethancompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMorethancompare(SimpleDraftGParser.MorethancompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntend(SimpleDraftGParser.IntendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntend(SimpleDraftGParser.IntendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(SimpleDraftGParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleDraftGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(SimpleDraftGParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondequality(SimpleDraftGParser.CondequalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondequality(SimpleDraftGParser.CondequalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondint(SimpleDraftGParser.CondintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondint(SimpleDraftGParser.CondintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondid(SimpleDraftGParser.CondidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondid(SimpleDraftGParser.CondidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondmultdiv(SimpleDraftGParser.CondmultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondmultdiv(SimpleDraftGParser.CondmultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondlessgreater(SimpleDraftGParser.CondlessgreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondlessgreater(SimpleDraftGParser.CondlessgreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondplusminus(SimpleDraftGParser.CondplusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleDraftGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondplusminus(SimpleDraftGParser.CondplusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#arrvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrvalue(SimpleDraftGParser.ArrvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#arrvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrvalue(SimpleDraftGParser.ArrvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleDraftGParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SimpleDraftGParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleDraftGParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SimpleDraftGParser.CommentContext ctx);
}