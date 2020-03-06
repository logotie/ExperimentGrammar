package engine;

import engine.util.EngineConstants;
import engine.util.GenPair;
import engine.util.Result;
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
    public static Stack<GenPair<EngineConstants.Types, ParserRuleContext>> InstructionStack = new Stack<>();
    public static Stack<ParserRuleContext> Terminals = new Stack<>();
    public static Map<String, Result> Solved = new HashMap<>();

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

        var popped = InstructionStack.pop();

        System.out.println("t");
    }

}
