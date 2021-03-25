package week14.d01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Transformers {
    
    public <T, R> List<R> map(List<T> list, Function<T, R> transformer) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result;
        //return list.stream().map(transformer::apply).collect(Collectors.toList());
    }
    
    public <T> T reduce(List<T> list, T identity, BiFunction<T, T, T> combiner) {
        
        T result = identity;
        for (T item : list) {
            result = combiner.apply(result, item);
        }
        return result;
        //return list.stream().reduce(identity, combiner::apply);
    }
}
