package engine.util;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Stack;

public class InstructionStack {

    private Stack<ParserRuleContext> instrucs;
    private Stack<EngineConstants.Types> types;
    private Stack<EngineConstants.InstructionTypes> instrucType;

    public InstructionStack(){
        instrucs=new Stack<>();
        types=new Stack<>();
        instrucType = new Stack<>();
    }

    public void push(EngineConstants.Types type, ParserRuleContext ctx, EngineConstants.InstructionTypes instructionType){
        instrucs.push(ctx);
        types.push(type);
        instrucType.push(instructionType);
    }

    public GenPair<EngineConstants.Types, ParserRuleContext> popInstruc(){
        ParserRuleContext instruction = instrucs.pop();
        EngineConstants.Types type = types.pop();

        return new GenPair<EngineConstants.Types, ParserRuleContext>(type, instruction);
    }


}
