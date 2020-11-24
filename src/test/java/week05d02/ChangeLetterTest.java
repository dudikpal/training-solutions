package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    void testWithChange() {
        ChangeLetter cl = new ChangeLetter();
        String str = "andokuba";
        assertEquals("*nd*k*b*", cl.changeVowels(str));
    }

    @Test
    void testWithoutChange() {
        ChangeLetter cl = new ChangeLetter();
        String str = "kndfktbl";
        assertEquals("kndfktbl", cl.changeVowels(str));
    }
}
