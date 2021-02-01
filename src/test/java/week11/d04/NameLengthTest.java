package week11.d04;

import org.junit.jupiter.api.Test;
import week11.d04.NameLength;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {

    @Test
    void getLengths() {
        NameLength nl = new NameLength();

        List<String> names = List.of("Joe", "Jack", "Jane", "Jake", "George", "William");

        assertEquals(2, nl.getLengths(names).size());
    }

    @Test
    void testElements() {
        NameLength nl = new NameLength();

        List<String> names = List.of("Joe", "Jack", "Jane", "Jake", "George", "William");

        assertEquals("[3, 4]", nl.getLengths(names).toString());
    }
}