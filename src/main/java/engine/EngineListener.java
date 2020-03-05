package engine;

import grammar.SimpleGBaseListener;
import grammar.SimpleGParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Stack;

public class EngineListener extends SimpleGBaseListener {

    public static Stack<SimpleGParser.ExprContext> expStack = new Stack<SimpleGParser.ExprContext>();

    @Override
    public void enterAssigntype(SimpleGParser.AssigntypeContext assignmentContext){

        //var a = a+1;
        //var a = a+a+a/4-a-a;
        //var a = expr+expr+expr/Int-expr-expr;

        //LOOK FOR THE END STATEMENT AND WORK BACKWARDS
        int amountOfTokens = assignmentContext.getChildCount();


        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new EngineExpressionListener(), assignmentContext.children.get(0));

        //get the children
        //check if they are any expressions in the children
        //increment level by 1

        //while loop
        //Get children
        //Pass children to function returns true or false, if express
        //If true, pass to process exp


        //Process exp
        //Adds current exp to stack

        System.out.println("AssignmentSpecial");
    }



    @Override
    public void enterForloop(SimpleGParser.ForloopContext forloopContext){
        System.out.println("For loop special");
    }

    @Override
    public void enterIfstat(SimpleGParser.IfstatContext ifStatementContext){
        System.out.println("if statement special");
    }


}
