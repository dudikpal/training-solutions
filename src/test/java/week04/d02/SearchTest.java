package week04.d02;

import org.junit.jupiter.api.Test;
import week04.d02.Search;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    void TestCharOperations() {
        Search search = new Search();

        String base = "alma";
        String part = "a";
        List<Integer> result = new ArrayList<>(){{add(0);add(3);}};

        assertEquals(result, search.getIndexesOfChar(base, part));}


}
