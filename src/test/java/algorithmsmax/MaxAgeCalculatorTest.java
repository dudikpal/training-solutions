package algorithmsmax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAgeCalculatorTest {

    @Test
    void testTrainerMaxAge() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        List<Trainer> trainers = Arrays.asList(
                new Trainer("John", 60),
                new Trainer("Bill", 20),
                new Trainer("Kate", 70),
                new Trainer("Mary", 78),
                new Trainer("Karl", 20)
        );

        assertEquals(78, maxAgeCalculator.trainerWithMaxAge(trainers).getAge());
    }
}
