package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void testCreate() {
        PairFinder pairFinder = new PairFinder();

        int[] arr = {7, 1, 5, 7, 3, 3, 5, 7, 6, 7};

        assertEquals(4, pairFinder.findPairs(arr));
    }

}