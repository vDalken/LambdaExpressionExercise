import java.util.ArrayList;
import java.util.List;

class Producer<T> {
    public List<T> produce(int number, Generator<T> generator){
        List<T> list = new ArrayList<>();
        while(number>0){
            list.add(generator.generate());
            number--;
        }
        return list;
    }
}
