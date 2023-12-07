import java.util.ArrayList;
import java.util.List;

class Transformer {
    List<String> applyTransformation(List<String> list, Transformation transformation){
        int index=0;
        for (String s : list) {
            list.set(index, transformation.transform(s));
            index++;
        }
        return list;
    }
}
