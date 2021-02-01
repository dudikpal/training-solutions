package week12.d05;

import org.junit.jupiter.api.Test;
import week12.d05.WordCounter;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void wordCounter() {
        String line = "andokuba, >>& koronavírus";

        WordCounter wc = new WordCounter();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("index.html");
        assertEquals(8, wc.wordCounter(is));
    }
}