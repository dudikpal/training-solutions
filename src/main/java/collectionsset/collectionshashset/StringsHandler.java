package collectionsset.collectionshashset;

import collectionsset.helper.RandomStringGenerator;

import java.util.*;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {
        Set<String> uniqueStrings = new HashSet<>(stringCollection);
        return uniqueStrings;
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        setA.retainAll(setB);
        return setA;
    }
}
