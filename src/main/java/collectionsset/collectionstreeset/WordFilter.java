package collectionsset.collectionstreeset;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] strings) {
        Set<String> filteredWords = new TreeSet<>(List.of(strings));
        return filteredWords;
    }
}
