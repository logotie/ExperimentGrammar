package engine.decoder;

import engine.util.Result;
import engine.util.TerminalExpr;
import grammar.SimpleDraftGParser;
import org.antlr.v4.runtime.ParserRuleContext;

import static engine.EngineRunner.Terminals;

public class ArithmeticDecoder {

    public static void DecodeMathInstructionWarm(SimpleDraftGParser.ExprContext instruction){

//        Pop the lowest instruction off the stack.
//                We get all the children in the instruction.
//                The children with length of 1, get their hashcode
//        Retrieve them from terminals, using hashcode.
//                Pass the terminals in specific order with operation.
//                Get back result object.
//                Store result object with hashcode of expr in solved.
//        Throw rest away.



    }

    public static void DecodeMathInstructionCold(SimpleDraftGParser.ExprContext instruction){

        //Get all the children
        var children = instruction.children;

        assert children.size() == 3;

        //3 children for example: 'expr' '+' 'expr'
        if(children.size()!=3){
            throw new RuntimeException();
        }

        //if 1 it's a terminal, if not it's an expression
        SimpleDraftGParser.ExprContext firstLeft = (SimpleDraftGParser.ExprContext) children.get(0);

        //Right operand
        SimpleDraftGParser.ExprContext firstRight = (SimpleDraftGParser.ExprContext) children.get(2);

        //Operation
        String operand = children.get(1).getText();

        assert isExprTerminal(firstRight)||isExprTerminal(firstLeft);

        SimpleDraftGParser.ExprContext terminal = isExprTerminal(firstLeft) ? firstLeft : firstRight;

       // Result operationResult =
    }

    //FIRST MUST DETERMINE WHICH ONE IS A TERMINAL
    private static Result calculator(SimpleDraftGParser.ExprContext terminal, String operand, SimpleDraftGParser.ExprContext right){

        assert isExprTerminal(terminal);

        //Get the terminal in a form which contains the type
        TerminalExpr terminalExpr = retrieveMatchingExpr(terminal);

        //Now we need to know if right is a terminal

        if(isExprTerminal(right)){

            TerminalExpr terminalExpr2 = retrieveMatchingExpr(right);

            Result res = rawTerminalCalc(terminalExpr, terminalExpr2, operand);
        }
        else
        {
            //we get the solved
            //pass to terminal
            //return the result
        }

        return null;
    }

    //Here we enforce that when adding two variables together they must be of the same type.
    //TWO STRINGS CAN BE ADDED TOGETHER
    //TWO INTS CAN BE ADDED TOGETHER
    //INT = STRING + INT <---- NO
    //TODO Array + variable/literal of same type just appends to end of array
    private static Result rawTerminalCalc(TerminalExpr t, TerminalExpr t2, String op){

        if(t.isInt()&&t2.isInt()){

        }

        if(!t.isInt() && !t2.isInt()){

        }

        throw new RuntimeException();
    }

    private static boolean isExprTerminal(SimpleDraftGParser.ExprContext exprContext){
        //it's a terminal if the size is max 1
        //if the hashcode is in the terminal stack.

        if(exprContext.children.size()==1
                &&
                Terminals.exists(exprContext))
        {
            return true;
        }

        return false;

    }

    private static TerminalExpr retrieveMatchingExpr(SimpleDraftGParser.ExprContext exprContext){
        assert Terminals.exists(exprContext);

        return Terminals.getByObjRef((ParserRuleContext)exprContext);
    }

}
