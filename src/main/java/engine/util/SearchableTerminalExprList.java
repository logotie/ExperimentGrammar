package engine.util;

import java.util.ArrayList;
import java.util.List;

public class SearchableTerminalExprList {

    private List<TerminalExpr> privInstrStack= new ArrayList<>();

    public void add(TerminalExpr instruc){
        privInstrStack.add(instruc);
    }

    public boolean existsByHashCodeInnerExprDeprecated(int hashCode){

        long matching = privInstrStack.stream().filter(n -> n.getExpr().hashCode()==hashCode).count();

        if(matching==0){
            return false;
        }
        return true;
    }

    public TerminalExpr getByHashCode(int hashCode){
        assert existsByHashCodeInnerExpr(hashCode);

        TerminalExpr terminal = privInstrStack.stream().filter(n -> n.hashCode()==hashCode)
                .findAny().get();

        long matching = privInstrStack.stream().filter(n -> n.getExpr().hashCode()==hashCode).count();

        assert matching == 1;

        return terminal;
    }


}
