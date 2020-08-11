package engine;
import grammar.*;
import main.Starter;

public class InstructionRunner {

    //Runs a single block at a time
    public void start(){

        SimpleDraftGParser.BlockContext currentInstruc = Starter.Global_Blocks_iq.remove();
        process(currentInstruc);

    }

    private void process(SimpleDraftGParser.BlockContext ctx){

        var er = new EngineRunner();
        er.ProcessBlock(ctx);






    }

}
