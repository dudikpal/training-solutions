package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

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