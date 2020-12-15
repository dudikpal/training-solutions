package week08.d02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    @Test
    void testCreate() {
        CountryStatistics cs = new CountryStatistics();

        cs.readFromFile("countries.txt");

        assertEquals(79, cs.maxPopulation());
    }

}