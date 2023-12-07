import java.util.LinkedList;
import java.util.List;

class Filterer {
    public List<String> filter(List<String> list, Filter filter){
        List<String> newList = new LinkedList<>();
        for(String element : list){
            if(filter.accept(element)){
                newList.add(element);
            }
        }
        return newList;
    }
}
