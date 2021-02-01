package week07.d01;

import org.junit.jupiter.api.Test;
import week07.d01.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testCreate() {
        Fibonacci fb = new Fibonacci();
        assertEquals(13, fb.fib(7));
    }
}