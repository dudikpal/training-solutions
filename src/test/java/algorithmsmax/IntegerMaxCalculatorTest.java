package algorithmsmax;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerMaxCalculatorTest {

    @Test
    void testReturnMaxNumber() {

        IntegerMaxCalculator intMax = new IntegerMaxCalculator();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(30);
        numbers.add(311);
        numbers.add(343);
        numbers.add(32);

        assertEquals(343, intMax.getMaxNumber(numbers));
    }
}
