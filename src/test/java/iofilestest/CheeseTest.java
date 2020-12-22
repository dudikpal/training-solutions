package iofilestest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseTest {

    @Test
    void testNameIsNull() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Cheese(null, 3.4));
        assertEquals("Name is empty or null!", ex.getMessage());
    }

    @Test
    void testNameIsEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Cheese("", 3.4));
        assertEquals("Name is empty or null!", ex.getMessage());
    }

    @Test
    void testLactozIsNotNegative() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Cheese("név", -5));
        assertEquals("The number must be positive!", ex.getMessage());
    }

}