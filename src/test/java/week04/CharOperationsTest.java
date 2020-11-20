package week04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharOperationsTest {

    @Test
    void TestCharOperations() {
        CharOperations charOperations = new CharOperations();

        String base = "alma";
        String part = "a";
        List<Integer> result = new ArrayList<>(){{add(0);add(3);}};

        assertEquals(result, charOperations.getPositionOfChar(base, part));}


}
