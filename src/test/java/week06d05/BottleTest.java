package week06d05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    private Bottle bottle;

    @BeforeEach
    void setUp() {
        bottle = Bottle.of(BottleType.GLASS_BOTTLE);
    }

    @Test
    void testCreate() {

        assertEquals(20, bottle.getType().getMaximumAmount());
    }

    @Test
    void testOverFilling() {
        bottle.fill(15);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> bottle.fill(15));
        assertEquals("Overflow error!", ex.getMessage());

    }

    @Test
    void testFilling() {

        bottle.fill(11);

        assertEquals(11, bottle.getFilledUntil());
    }

}