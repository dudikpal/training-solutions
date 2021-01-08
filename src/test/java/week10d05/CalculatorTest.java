package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testLessThen4Numbers() {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3};

        assertEquals(6, calculator.findMinMaxSum(numbers).getMin());
        assertEquals(6, calculator.findMinMaxSum(numbers).getMax());
    }

    @Test
    void testMoreThen4Numbers() {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};

        assertEquals(10, calculator.findMinMaxSum(numbers).getMin());
        assertEquals(14, calculator.findMinMaxSum(numbers).getMax());
    }

}