package week12.d03;

import org.junit.jupiter.api.Test;
import week12.d03.AgeSorter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AgeSorterTest {

    @Test
    void sortAges() {
        int[] ages = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(new AgeSorter().sortAges(ages)));
    }
}