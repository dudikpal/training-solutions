package week10d02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void testMaxStation() {
        Travel travel = new Travel();

        InputStream is = this.getClass().getClassLoader().getResourceAsStream("week10d02/eberletek.txt");

        assertEquals(0, travel.getStopWithMax(is));
    }
}