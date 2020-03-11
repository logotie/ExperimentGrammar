package engine;

import engine.util.EngineConstants;
import engine.util.TerminalExpr;
import grammar.SimpleGBaseListener;
import grammar.SimpleGParser;
import jdk.jshell.spi.ExecutionControl;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Stack;

import static engine.EngineRunner.InstructionStack;
import static engine.EngineRunner.Terminals;

public class EngineListener extends SimpleGBaseListener {

    int counter = 0;


    @Override public void enterAssignstringmutablesingletype(SimpleGParser.AssignstringmutablesingletypeContext ctx) {         assert ctx.children.size()>1;

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable str Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterAssigndigitsmutablesingletype(SimpleGParser.AssigndigitsmutablesingletypeContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign digit mutable num Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterAssignstringmutablechangetype(SimpleGParser.AssignstringmutablechangetypeContext ctx) {
        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable 'a='c' Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }
    }

    @Override public void enterAssignmutable(SimpleGParser.AssignmutableContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign mutable a=2 Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterAssignstringnonmutable(SimpleGParser.AssignstringnonmutableContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable a:'3' Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNNONMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }
    }

    @Override public void enterAssigndigitsnonmutable(SimpleGParser.AssigndigitsnonmutableContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNNONMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterAssigndigitsnonmutablesingletype(SimpleGParser.AssigndigitsnonmutablesingletypeContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNNONMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }


    @Override public void enterAssignstringnonmutablesingletype(SimpleGParser.AssignstringnonmutablesingletypeContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNNONMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterArraymutableassign(SimpleGParser.ArraymutableassignContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterArraynonmutableassign(SimpleGParser.ArraynonmutableassignContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNNONMUTABLE, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterArrvalue(SimpleGParser.ArrvalueContext ctx) {

        System.out.println(ctx.getText());
        assert ctx.children.size()==1;
        if(ctx.children.size()==1){
            TerminalExpr term = new TerminalExpr(ctx, true);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }

    }


    //FUNCTIONAL
    @Override public void enterAdd(SimpleGParser.AddContext ctx) {
        counter++;

        assert ctx.children.size()>1;

        System.out.println(ctx.getText()+":"+counter+"-Add Children Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ARITHMETIC, ctx);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterMinus(SimpleGParser.MinusContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    @Override public void enterLessthancompare(SimpleGParser.LessthancompareContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    @Override public void enterMul(SimpleGParser.MulContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }


    @Override public void enterDiv(SimpleGParser.DivContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    @Override public void enterIdend(SimpleGParser.IdendContext ctx) {
        System.out.println(ctx.getText());
        assert ctx.children.size()==1;
        if(ctx.children.size()==1){
            TerminalExpr term = new TerminalExpr(ctx, true);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }
    }

    @Override public void enterMorethancompare(SimpleGParser.MorethancompareContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    //FUNCTIONAL
    @Override public void enterIntend(SimpleGParser.IntendContext ctx) {
        counter++;
        System.out.println(ctx.getText()+":"+counter+"-IntEnd Children Count:"+ctx.children.size());

        assert ctx.children.size()==1;

        if(ctx.children.size()==1){
            TerminalExpr term = new TerminalExpr(ctx, true);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }
    }

    @Override public void enterEquality(SimpleGParser.EqualityContext ctx) {
        System.out.println(ctx.getText());
        throw new UnsupportedOperationException();
    }

}
