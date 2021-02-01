package week13.d01;

import org.junit.jupiter.api.Test;
import week13.d01.Cities;

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