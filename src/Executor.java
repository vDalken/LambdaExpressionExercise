import java.util.List;

class Executor {
    public void executeAction(List<String> list, Action action){
       for(String element : list){
           action.execute(element);
       }
    }
}
