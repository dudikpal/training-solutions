package week11d04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameLength {

    public List<Integer> getLengths(List<String> names) {
        HashSet<Integer> lengths = new HashSet<>();
        for (String name: names) {
            if (name.startsWith("J")) {
                lengths.add(name.length());
            }
        }
        return new ArrayList<>(lengths);
    }
}
