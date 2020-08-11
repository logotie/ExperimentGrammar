package engine.util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class TypeHelper {

    private enum TokenPos{
        LEFT, RIGHT
    }

    public static boolean AreBothLiteralsOneType(){
        throw new UnsupportedOperationException();
    }

    public static boolean IsParserContextString(ParserRuleContext expr){
        assert expr.children.size() == 1;
        //Ensure that children is 1

        var parent = expr.getParent();

        var allChildrenTerms = parent.children;

        assert IsRuleInArr(expr, allChildrenTerms);

        var idxInChildren = RetrieveIdxOfRuleInArr(expr, allChildrenTerms);

        boolean flag = IsTokenSurroundedByStringChars(allChildrenTerms, idxInChildren);

        return flag;
    }


    private static boolean IsRuleInArr(ParserRuleContext term, List<ParseTree> terms){
        for(int i=0; i<terms.size(); i++){
            if(term==terms.get(i)){
                return true;
            }
        }
        return false;
    }

    private static boolean IsTokenSurroundedByStringChars(List<ParseTree> terms, int termIdx){

        if(termIdx<0||termIdx==0){
            return false;
        }

        int totalAmountOfTerms = terms.size();

        int totalIdxAdjusted = totalAmountOfTerms-1;

        if(termIdx+1>totalIdxAdjusted||termIdx-1>totalIdxAdjusted){
            return false;
        }

        var tokenLeft = getTokenAtPos(terms, termIdx, TokenPos.LEFT);
        if(tokenLeft.getText().equals("\"")){
            var tokenRight = getTokenAtPos(terms, termIdx, TokenPos.RIGHT);
            if(tokenRight.getText().equals("\"")){
                return true;
            }
        }
        return false;
    }

    private static ParserRuleContext getTokenAtPos(List<ParseTree> terms, int idxOfCurTerm, TokenPos posOfTerm){
        int maxIdx = terms.size()-1;

        assert idxOfCurTerm+1 <= maxIdx;
        assert idxOfCurTerm-1 <= maxIdx;

        if(posOfTerm==TokenPos.LEFT){
            var idx = idxOfCurTerm-1;
            return (ParserRuleContext)terms.get(idx);
        }else{
            var idx = idxOfCurTerm+1;
            return (ParserRuleContext)terms.get(idx);
        }
    }



    private static int RetrieveIdxOfRuleInArr(ParserRuleContext term, List<ParseTree> terms){
        for(int i=0; i<terms.size(); i++){
            if(term==terms.get(i)){
                return i;
            }
        }
        return -1;
    }





}
