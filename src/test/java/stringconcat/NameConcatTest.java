package stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameConcatTest {

    @Test
    void testNameWesternStyle() {
        NameConcat nameConcat = new NameConcat("Dick", "Van", "Dyke", Title.MR);

        String result = nameConcat.concatNameWesternStyle();

        assertEquals("Mr Dick Van Dyke", result);
    }

    @Test
    void testNameHungarianStyle() {
        NameConcat nameConcat = new NameConcat("Arisztid", "Cefre", "Kapatos");

        String result = nameConcat.concatNameHungarianStyle();

        assertEquals("Kapatos Cefre Arisztid", result);
    }
}
