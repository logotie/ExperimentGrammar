package engine;
import main.ShortToUnicodeString;
import main.Starter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import test.SimpleGParser;

import java.util.List;

public class InstructionRunner {

    public void start(){

        SimpleGParser.BlockContext currentInstruc = Starter.Global_iq.remove();
        process(currentInstruc);

    }

    private void process(SimpleGParser.BlockContext ctx){
        //We have block context
        List<ParseTree> nodes = ctx.children;
        //Gonna walk it
        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();


        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new EngineListener(), nodes.get(0));


    }

}
