package engine.util;

import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class TerminalExpr {

    private ParserRuleContext terminalRule;
    private boolean isInt;
    private String rawValue;

    public TerminalExpr(ParserRuleContext terminalParseRule, Boolean isInt){
        assert terminalRule.children.size()==1;
        this.terminalRule = terminalParseRule;
        this.isInt = isInt;
        rawValue = terminalParseRule.children.get(0).getText();
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
