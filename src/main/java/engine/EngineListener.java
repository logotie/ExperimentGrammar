package engine;

import engine.util.EngineConstants;
import engine.util.TerminalExpr;
import engine.util.TypeHelper;
import grammar.*;

import static engine.EngineRunner.InstructionStack;
import static engine.EngineRunner.Terminals;

public class EngineListener extends SimpleDraftGBaseListener {

    int counter = 0;


    @Override public void enterAssignString(SimpleDraftGParser.AssignStringContext ctx) {         assert ctx.children.size()>1;

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable str Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx, EngineConstants.InstructionTypes.ASSIGNMENT);
        }else {
            //it's a terminal
            throw new RuntimeException();
        }

    }

    @Override public void enterAssignDigits(SimpleDraftGParser.AssignDigitsContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign digit mutable num Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx, EngineConstants.InstructionTypes.ASSIGNMENT);
        }else {
            //it's a terminal
            throw new RuntimeException();
        }

    }

    @Override public void enterAssignNumArray(SimpleDraftGParser.AssignNumArrayContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx, EngineConstants.InstructionTypes.ASSIGNMENT);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterAssignStrArray(SimpleDraftGParser.AssignStrArrayContext ctx) {

        System.out.println(ctx.getText()+":"+counter+"-Assign String mutable Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ASSIGNMUTABLE, ctx, EngineConstants.InstructionTypes.ASSIGNMENT);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterArrvalue(SimpleDraftGParser.ArrvalueContext ctx) {

        System.out.println(ctx.getText());

        boolean isArrValueStr = TypeHelper.IsParserContextString(ctx);

        assert ctx.children.size()==1;
        if(ctx.children.size()==1){
            boolean isInt = !isArrValueStr;
            TerminalExpr term = new TerminalExpr(ctx, isInt, EngineConstants.TerminalTypes.ARRVALUE);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }

    }


    //FUNCTIONAL
    @Override public void enterAdd(SimpleDraftGParser.AddContext ctx) {
        counter++;

        assert ctx.children.size()>1;

        System.out.println(ctx.getText()+":"+counter+"-Add Children Count:"+ctx.children.size());
        //As having children greater than one in the node denotes a level
        if(ctx.children.size()>1) {
            InstructionStack.push(EngineConstants.Types.ARITHMETIC, ctx, EngineConstants.InstructionTypes.EXPR);
        }else {
            throw new RuntimeException();
        }

    }

    @Override public void enterMinus(SimpleDraftGParser.MinusContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    @Override public void enterLessthancompare(SimpleDraftGParser.LessthancompareContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    @Override public void enterMul(SimpleDraftGParser.MulContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }


    @Override public void enterDiv(SimpleDraftGParser.DivContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    //THIS WILL BE FROM [A-Z] but it could be a
    @Override public void enterIdend(SimpleDraftGParser.IdendContext ctx) {
        boolean isArrValueStr = TypeHelper.IsParserContextString(ctx);

        System.out.println(ctx.getText());
        assert ctx.children.size()==1;
        if(ctx.children.size()==1){
            TerminalExpr term = new TerminalExpr(ctx, !isArrValueStr, EngineConstants.TerminalTypes.EXPR);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }
    }

    @Override public void enterMorethancompare(SimpleDraftGParser.MorethancompareContext ctx) {
        System.out.println(ctx.toString());
        throw new UnsupportedOperationException();
    }

    //FUNCTIONAL
    @Override public void enterIntend(SimpleDraftGParser.IntendContext ctx) {
        counter++;
        System.out.println(ctx.getText()+":"+counter+"-IntEnd Children Count:"+ctx.children.size());

        boolean isArrValueStr = TypeHelper.IsParserContextString(ctx);


        assert ctx.children.size()==1;

        if(ctx.children.size()==1){
            TerminalExpr term = new TerminalExpr(ctx, !isArrValueStr, EngineConstants.TerminalTypes.EXPR);
            Terminals.add(term);
        }else{
            throw new RuntimeException();
        }
    }

    @Override public void enterEquality(SimpleDraftGParser.EqualityContext ctx) {
        System.out.println(ctx.getText());
        throw new UnsupportedOperationException();
    }

}
