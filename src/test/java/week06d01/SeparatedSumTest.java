package week06d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testCreate() {
        SeparatedSum ss = new SeparatedSum();

        String numbers = "10,5;-10,5;20,5;-20,5";

        assertEquals(31, ss.sum(numbers).getSumOfPositiveNumbers());
        assertEquals(-31, ss.sum(numbers).getSumOfNegativeNumbers());
    }

}