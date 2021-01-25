package week13d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CitiesTest {

    @Test
    void firstCity() {
        String file = "/cities.txt";

        Cities cities = new Cities();

        assertEquals("Aba", cities.firstCity(file).getName());
        assertEquals("8127", cities.firstCity(file).getIrsz());
    }
}