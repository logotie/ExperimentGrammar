package engine.util;

import grammar.SimpleGParser;

public class TerminalExpr {

    private SimpleGParser.ExprContext expr;
    private boolean isInt;
    private String rawValue;

    public TerminalExpr(SimpleGParser.ExprContext expr, Boolean isInt){
        assert expr.children.size()==1;
        this.expr = expr;
        this.isInt = isInt;
    }

    public SimpleGParser.ExprContext getExpr(){
        return expr;
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
