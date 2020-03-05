package engine;

import test.SimpleGBaseListener;
import test.SimpleGParser;

public class EngineListener extends SimpleGBaseListener {

    @Override
    public void enterAssignment(SimpleGParser.AssignmentContext assignmentContext){

        //var a = a+1;
        
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

    @Override
    public void enterExpr(SimpleGParser.ExprContext exprContext){

        System.out.println("expr special");

    }

}
