package week10.d02;

import org.junit.jupiter.api.Test;
import week10.d02.Travel;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void testMaxStation() {
        Travel travel = new Travel();

        InputStream is = this.getClass().getClassLoader().getResourceAsStream("week10d02/eberletek.txt");

        assertEquals(0, travel.getStopWithMax(is));
    }
}