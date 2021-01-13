package week11d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void countChars() {
        CharCounter charCounter = new CharCounter();

        String[] arr = {"abc", "cba", "acb", "dcbsgaa"};

        assertEquals(3, charCounter.countChars(arr));
    }
}