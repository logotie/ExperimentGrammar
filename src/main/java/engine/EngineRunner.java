package engine;

import engine.decoder.ArithmeticDecoder;
import engine.util.*;
import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class EngineRunner {

    //We use a LIFO stack as the instruction on the last level is the one we work with first.
    public static engine.util.InstructionStack InstructionStack = new InstructionStack();
    //This we use to store the INTEND, IDEND rules.
    public static SearchableList Terminals = new SearchableList();
    public static Map<String, Result> Solved = new HashMap<>();
    public static int counter = 0;

    public void ProcessBlock(SimpleGParser.BlockContext ctx){
        //We have block context
        List<ParseTree> nodes = ctx.children;
        //Gonna walk it
        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new EngineListener(), nodes.get(0));

        //Once the block tree has been walked start processing instruction.
        //Major instructions should be added after the tree has been walked
        //Terminals should have been added also.
        System.out.println("DEBUG");

        var mostRecentInstruction = InstructionStack.popInstruc();

        //Start processing
        InstructRouter(mostRecentInstruction.getT(), mostRecentInstruction.getT2());
    }

    private void InstructRouter(EngineConstants.Types type, ParserRuleContext instruction){
        if(counter>0) {

            switch (type) {
                case ARITHMETIC:
                    SimpleGParser.ExprContext exprInstruc = (SimpleGParser.ExprContext)instruction;
                    ArithmeticDecoder.DecodeMathInstructionWarm(exprInstruc);
                    break;
            }

        }else{

            switch (type){
                case ARITHMETIC:
                    SimpleGParser.ExprContext exprInstruc = (SimpleGParser.ExprContext)instruction;
                    ArithmeticDecoder.DecodeMathInstructionCold(exprInstruc);
                    break;
            }

        }
    }

}
