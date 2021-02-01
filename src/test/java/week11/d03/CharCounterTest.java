package week11.d03;

import org.junit.jupiter.api.Test;
import week11.d03.CharCounter;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void countChars() {
        CharCounter charCounter = new CharCounter();

        String[] arr = {"abc", "cba", "acb", "dcbsgaa"};

        assertEquals(3, charCounter.countChars(arr));
    }
}