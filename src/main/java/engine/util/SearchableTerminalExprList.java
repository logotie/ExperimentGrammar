package engine.util;

import grammar.SimpleGParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class SearchableTerminalExprList {

    private List<TerminalExpr> privInstrStack= new ArrayList<>();

    public void add(TerminalExpr instruc){
        privInstrStack.add(instruc);
    }

    public boolean exists(ParserRuleContext expr){

        for(TerminalExpr term: privInstrStack){
            if(term.getExpr()==(ParserRuleContext)expr){
                return true;
            }
        }

        return false;
    }

    public TerminalExpr getByObjRef(ParserRuleContext parserRuleContext){
        assert exists(parserRuleContext);

        for(TerminalExpr term: privInstrStack){
            if(term.getExpr()==parserRuleContext){
                return term;
            }
        }

        return null;
    }


}
