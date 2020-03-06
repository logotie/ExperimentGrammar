package engine;
import main.ShortToUnicodeString;
import main.Starter;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import grammar.SimpleGParser;

import java.util.List;

public class InstructionRunner {

    //Runs a single block at a time
    public void start(){

        SimpleGParser.BlockContext currentInstruc = Starter.Global_Blocks_iq.remove();
        process(currentInstruc);

    }

    private void process(SimpleGParser.BlockContext ctx){

        var er = new EngineRunner();
        er.ProcessBlock(ctx);






    }

}
