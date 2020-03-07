package engine.util;

import grammar.SimpleGParser;
import grammar.SimpleGParser.ExprContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SearchableList {

    private List<TerminalExpr> privInstrStack= new ArrayList<>();

    public void add(TerminalExpr instruc){
        privInstrStack.add(instruc);
    }

    public boolean existsByHashCode(int hashCode){

        long matching = privInstrStack.stream().filter(n -> n.hashCode()==hashCode).count();

        if(matching==0){
            return false;
        }
        return true;
    }

    public TerminalExpr getByHashCode(int hashCode){
        assert existsByHashCode(hashCode);

        TerminalExpr terminal = privInstrStack.stream().filter(n -> n.hashCode()==hashCode)
                .findAny().get();

        return terminal;
    }


}
