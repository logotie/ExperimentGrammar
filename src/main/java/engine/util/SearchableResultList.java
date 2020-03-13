package engine.util;

import java.util.ArrayList;
import java.util.List;

public class SearchableResultList {

    private List<Result> privResults= new ArrayList<>();

    public void add(Result result){
        privResults.add(result);
    }


}
