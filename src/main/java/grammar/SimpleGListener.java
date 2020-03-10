// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
package grammar;
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
	 * Enter a parse tree produced by {@link SimpleGParser#sysfunc}.
	 * @param ctx the parse tree
	 */
	void enterSysfunc(SimpleGParser.SysfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#sysfunc}.
	 * @param ctx the parse tree
	 */
	void exitSysfunc(SimpleGParser.SysfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignstringmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignstringmutablesingletype(SimpleGParser.AssignstringmutablesingletypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignstringmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignstringmutablesingletype(SimpleGParser.AssignstringmutablesingletypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigndigitsmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssigndigitsmutablesingletype(SimpleGParser.AssigndigitsmutablesingletypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigndigitsmutablesingletype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssigndigitsmutablesingletype(SimpleGParser.AssigndigitsmutablesingletypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignstringmutablechangetype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignstringmutablechangetype(SimpleGParser.AssignstringmutablechangetypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignstringmutablechangetype}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignstringmutablechangetype(SimpleGParser.AssignstringmutablechangetypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmutable(SimpleGParser.AssignmutableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmutable(SimpleGParser.AssignmutableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignstringnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignstringnonmutable(SimpleGParser.AssignstringnonmutableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignstringnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignstringnonmutable(SimpleGParser.AssignstringnonmutableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigndigitsnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssigndigitsnonmutable(SimpleGParser.AssigndigitsnonmutableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigndigitsnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssigndigitsnonmutable(SimpleGParser.AssigndigitsnonmutableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigntextnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssigntextnonmutable(SimpleGParser.AssigntextnonmutableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigntextnonmutable}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssigntextnonmutable(SimpleGParser.AssigntextnonmutableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraymutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArraymutableassign(SimpleGParser.ArraymutableassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraymutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArraymutableassign(SimpleGParser.ArraymutableassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraynonmutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArraynonmutableassign(SimpleGParser.ArraynonmutableassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraynonmutableassign}
	 * labeled alternative in {@link SimpleGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArraynonmutableassign(SimpleGParser.ArraynonmutableassignContext ctx);
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
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SimpleGParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SimpleGParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SimpleGParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SimpleGParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(SimpleGParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(SimpleGParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessthancompare(SimpleGParser.LessthancompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessthancompare(SimpleGParser.LessthancompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(SimpleGParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(SimpleGParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdend(SimpleGParser.IdendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdend(SimpleGParser.IdendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMorethancompare(SimpleGParser.MorethancompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code morethancompare}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMorethancompare(SimpleGParser.MorethancompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntend(SimpleGParser.IntendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intend}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntend(SimpleGParser.IntendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(SimpleGParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link SimpleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(SimpleGParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondequality(SimpleGParser.CondequalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condequality}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondequality(SimpleGParser.CondequalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondint(SimpleGParser.CondintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condint}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondint(SimpleGParser.CondintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondid(SimpleGParser.CondidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condid}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondid(SimpleGParser.CondidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondmultdiv(SimpleGParser.CondmultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condmultdiv}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondmultdiv(SimpleGParser.CondmultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondlessgreater(SimpleGParser.CondlessgreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condlessgreater}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondlessgreater(SimpleGParser.CondlessgreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void enterCondplusminus(SimpleGParser.CondplusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condplusminus}
	 * labeled alternative in {@link SimpleGParser#conditon}.
	 * @param ctx the parse tree
	 */
	void exitCondplusminus(SimpleGParser.CondplusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#arrvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrvalue(SimpleGParser.ArrvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#arrvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrvalue(SimpleGParser.ArrvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SimpleGParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SimpleGParser.CommentContext ctx);
}