package engine.decoder;

import engine.util.Result;
import engine.util.TerminalExpr;
import grammar.SimpleGParser;
import grammar.SimpleGParser.ExprContext;

import static engine.EngineRunner.Terminals;

public class ArithmeticDecoder {

    public static void DecodeMathInstructionWarm(SimpleGParser.ExprContext instruction){

//        Pop the lowest instruction off the stack.
//                We get all the children in the instruction.
//                The children with length of 1, get their hashcode
//        Retrieve them from terminals, using hashcode.
//                Pass the terminals in specific order with operation.
//                Get back result object.
//                Store result object with hashcode of expr in solved.
//        Throw rest away.



    }

    public static void DecodeMathInstructionCold(SimpleGParser.ExprContext instruction){

        //1 WILL ALWAYS BE A TERMINAL

        //Get all the children
        var children = instruction.children;

        assert children.size() == 3;

        //3 children for example: 'expr' '+' 'expr'
        if(children.size()!=3){
            throw new RuntimeException();
        }

        //if 1 it's a terminal, if not it's an expression
        SimpleGParser.ExprContext firstLeft = (SimpleGParser.ExprContext) children.get(0);

        //Right operand
        SimpleGParser.ExprContext firstRight = (SimpleGParser.ExprContext) children.get(2);

        //Operation
        String operand = children.get(1).getText();

        assert isExprTerminal(firstRight)||isExprTerminal(firstLeft);

        ExprContext terminal = isExprTerminal(firstLeft) ? firstLeft : firstRight;

       // Result operationResult =
    }

    //FIRST MUST DETERMINE WHICH ONE IS A TERMINAL
    private static Result calculator(ExprContext terminal, String operand, ExprContext right){

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
            //we check solved.
        }

        return null;
    }

    //Here we enforce that when adding two variables together they must be of the same type.
    private static Result rawTerminalCalc(TerminalExpr t, TerminalExpr t2, String op){

        if(t.isInt()){
            int temp = t.getInt();
            if(t2.isInt()){
                int result = temp+t2.getInt();
            }else{

            }
        }
        
        return null;
    }

    private static boolean isExprTerminal(ExprContext exprContext){
        //it's a terminal if the size is max 1
        //if the hashcode is in the terminal stack.

        if(exprContext.children.size()==1
                &&
                Terminals.existsByHashCodeInnerExpr(exprContext.hashCode()))
        {
            return true;
        }

        return false;

    }

    private static TerminalExpr retrieveMatchingExpr(ExprContext exprContext){
        assert Terminals.existsByHashCodeInnerExpr(exprContext.hashCode());

        return Terminals.getByHashCode(exprContext.hashCode());
    }

}
