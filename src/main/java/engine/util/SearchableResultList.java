package engine.util;

import java.util.ArrayList;
import java.util.List;

public class SearchableResultList {

    private List<Result> privResults= new ArrayList<>();

    public void add(Result result){
        privResults.add(result);
    }

    //TODO WRONG!!!! NEED NEW SEARCH TERM
    public boolean existsByUniqueCode(int hashCode){

        long matching = privResults.stream().filter(n -> n.).count();

        if(matching==0){
            return false;
        }
        return true;
    }

    public Result getByHashCode(int hashCode){
        assert existsByUniqueCode(hashCode);

        Result terminal = privResults.stream().filter(n -> n.hashCode()==hashCode)
                .findAny().get();

        long matching = privResults.stream().filter(n -> n.hashCode()==hashCode).count();

        assert matching == 1;

        return terminal;
    }

}
