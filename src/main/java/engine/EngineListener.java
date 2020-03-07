package engine;

import engine.util.EngineConstants;
import grammar.SimpleGBaseListener;
import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Stack;

import static engine.EngineRunner.InstructionStack;
import static engine.EngineRunner.Terminals;

public class EngineListener extends SimpleGBaseListener {

    int counter = 0;


    @Override
    public void enterAssigntype(SimpleGParser.AssigntypeContext ctx){


        System.out.println(ctx.getText()+":"+counter+"-assignment Children Count:"+ctx.children.size());

        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGN, ctx);
        }

        //var a = a+1;
        //var a = a+a+a/4-a-a;
        //var a = expr+expr+expr/Int-expr-expr;




        //get the children
        //check if they are any expressions in the children
        //increment level by 1

        //while loop
        //Get children
        //Pass children to function returns true or false, if express
        //If true, pass to process exp


        //Process exp
        //Adds current exp to stack

        //System.out.println("AssignmentSpecial");
    }

    //FUNCTIONAL
    @Override public void enterChangeassign(SimpleGParser.ChangeassignContext ctx) {
        counter++;
        System.out.println(ctx.getText()+":"+counter);
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNCHANGE,ctx);
        }
    }

    //FUNCTIONAL
    @Override public void enterAdd(SimpleGParser.AddContext ctx) {
        counter++;

        System.out.println(ctx.getText()+":"+counter+"-Add Children Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ARITHMETIC, ctx);
        }

        if(ctx.children.size()==1){
            Terminals.push(ctx);
        }
    }

    @Override public void enterMinus(SimpleGParser.MinusContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterMinusend(SimpleGParser.MinusendContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterLessthancompare(SimpleGParser.LessthancompareContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterMul(SimpleGParser.MulContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterEqualityend(SimpleGParser.EqualityendContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterDivend(SimpleGParser.DivendContext ctx) {
        System.out.println(ctx.toString());
    }

    //FUNCTIONAL
    @Override public void enterAddend(SimpleGParser.AddendContext ctx) {
        counter++;

        System.out.println(ctx.getText()+":"+counter+"-Add Children Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ARITHMETIC,ctx);
        }

        if(ctx.children.size()==1){
            Terminals.push(ctx);
        }
    }

    @Override public void enterDiv(SimpleGParser.DivContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterMulend(SimpleGParser.MulendContext ctx) {
        System.out.println(ctx.toString());
    }

    @Override public void enterIdend(SimpleGParser.IdendContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override public void enterMorethancompare(SimpleGParser.MorethancompareContext ctx) {
        System.out.println(ctx.toString());
    }

    //FUNCTIONAL
    @Override public void enterIntend(SimpleGParser.IntendContext ctx) {
        counter++;
        System.out.println(ctx.getText()+":"+counter+"-IntEnd Children Count:"+ctx.children.size());

        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ARITHMETIC, ctx);
        }

        if(ctx.children.size()==1){
            Terminals.push(ctx);
        }
    }

    @Override public void enterEquality(SimpleGParser.EqualityContext ctx) {
        System.out.println(ctx.getText());
    }

}
