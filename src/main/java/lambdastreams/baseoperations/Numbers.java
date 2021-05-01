package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {

    private List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public Optional<Integer> min() {
        return numbers.stream().min((x, y) -> x - y);
        //return numbers.stream().min(Comparator.naturalOrder());

    }

    public int sum() {
        return numbers.stream().reduce(0, Integer::sum);
        //return numbers.stream().reduce(0, (x, y) -> x + y);
    }

    public Set<Integer> getDistinctElements() {
        return numbers.stream().collect(Collectors.toSet());
        //return numbers.stream().collect(Collectors.toSet());
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(x -> x > -1);
        //return numbers.stream().allMatch(x -> x >= 0);
    }
}
