import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Operation multiplication = (a,b) -> a*b;
        System.out.println(Calculator.executeOperation(2,7,multiplication));
        Filter filter = ((string) -> string.length()<5);
        Filterer filterer = new Filterer();
        List<String> listWithStrings = new LinkedList<>(List.of("gogogogo","letsaeee","maravilha","rito"));
        System.out.println(filterer.filter(listWithStrings, filter));

        Transformation transformation = (string) -> "adeus";
        Transformer transformer = new Transformer();
        System.out.println(transformer.applyTransformation(listWithStrings,transformation));

        Action action = System.out::println;
        Executor executor = new Executor();
        executor.executeAction(listWithStrings,action);

        Generator<String> generator = () -> "funcimina";
        Producer<String> producer = new Producer<>();
        System.out.println(producer.produce(9,generator));
    }
}