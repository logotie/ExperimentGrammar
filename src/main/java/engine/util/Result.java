package engine.util;

import org.antlr.v4.runtime.ParserRuleContext;

public class Result {

    private ParserRuleContext parent;
    private ParserRuleContext expression;
    private int result = 0;
    private boolean intActivated;
    private String resultString = "";
    private boolean stringActivated;
    private ResultType type;

    public enum ResultType{
        STR, INT;
    }


    public Result(ParserRuleContext parent, ParserRuleContext expr, String textRepresentation, ResultType resType) {
        this.parent = parent;
        expression = expr;
        resultString = textRepresentation;
        type = resType;
    }

    public ResultType getType(){
        return type;
    }

    public String getResult(){
        if(type==ResultType.INT){
            throw new RuntimeException();
        }
        return resultString;
    }

    public int getIntegerResult(){
        if(type==ResultType.STR){
            throw new RuntimeException();
        }
        return Integer.parseInt(resultString);
    }

}
