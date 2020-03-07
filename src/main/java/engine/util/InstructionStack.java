package engine.util;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Stack;

public class InstructionStack {

    private Stack<ParserRuleContext> instrucs;
    private Stack<EngineConstants.Types> types;


    public InstructionStack(){
        instrucs=new Stack<>();
        types=new Stack<>();
    }

    public void push(EngineConstants.Types type, ParserRuleContext ctx){
        instrucs.push(ctx);
        types.push(type);
    }

    public GenPair<EngineConstants.Types, ParserRuleContext> popInstruc(){
        ParserRuleContext instruction = instrucs.pop();
        EngineConstants.Types type = types.pop();

        return new GenPair<EngineConstants.Types, ParserRuleContext>(type, instruction);
    }


}
