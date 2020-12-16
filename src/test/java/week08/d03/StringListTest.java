package week08.d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    @Test
    void createList() {
        List<String> words = List.of("aaa", "aa", "bb", "ccc", "dd");

        StringList sl = new StringList();

        assertEquals("[aa, bb, dd]", Arrays.toString(sl.shortestWords(words).toArray()));
    }

}