package engine.decoder;

import com.ibm.icu.impl.Assert;
import engine.util.Result;
import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import grammar.SimpleGParser.ExprContext;

import java.util.ArrayList;
import java.util.List;

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

        //3 children for example: 'expr' '+' 'expr'
        if(children.size()!=3){
            throw new RuntimeException();
        }

        //Maximum of 2 exprcontexts, stored in a parsetree
        int size = children.get(0).getChildCount();

        //if 1 it's a terminal, if not it's an expression
        SimpleGParser.ExprContext firstLeft = (SimpleGParser.ExprContext) children.get(0);

        //Right operand
        SimpleGParser.ExprContext firstRight = (SimpleGParser.ExprContext) children.get(2);

        //Get hashcode
        int hashCode = firstLeft.hashCode();

        //This could be a terminal or it could be an expr


        ParseTree secondRight = children.get(2);

        //Operation
        String operand = children.get(1).getText();



    }

    //FIRST MUST DETERMINE WHICH ONE IS A TERMINAL
    private static Result calculator(ExprContext left, String operand, ExprContext right){
        return null;
    }

    private static boolean IsExprTerminal(ExprContext exprContext){
        //it's a terminal if the size is max 1
        //if the hashcode is in the terminal stack.

        if(exprContext.children.size()==1
                &&
                Terminals.existsByHashCode(exprContext.hashCode()))
        {
            return true;
        }

        return false;

    }

}
