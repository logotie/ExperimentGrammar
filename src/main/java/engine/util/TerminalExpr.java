package engine.util;

import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.UUID;

public class TerminalExpr {

    //COULD EITHER BE A ARRVALUE OR EXPR
    //COULD EITHER BE A STRING OR AN INT
    private ParserRuleContext terminalRule;
    private boolean isInt;
    private String rawValue;

    public EngineConstants.TerminalTypes getTerminalType() {
        return terminalType;
    }

    private EngineConstants.TerminalTypes terminalType;

    public TerminalExpr(ParserRuleContext terminalParseRule, Boolean isInt, EngineConstants.TerminalTypes terType){
        assert terminalParseRule.children.size()==1;
        this.terminalRule = terminalParseRule;
        this.isInt = isInt;
        terminalType = terType;

    }

    public ParserRuleContext getExpr(){
        return terminalRule;
    }

    public String getString(){
        if(!isInt){
            return rawValue;
        }else {
            throw new RuntimeException();
        }
    }

    public int getInt(){
        if(isInt){
            return Integer.parseInt(rawValue);
        }else{
            throw new RuntimeException();
        }
    }

    public boolean isInt(){
        return isInt;
    }


}
