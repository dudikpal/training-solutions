package week10.d01;

import org.junit.jupiter.api.Test;
import week10.d01.Elevations;
import week10.d01.HikingFile;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class HikingFileTest {

    @Test
    void testElevationsUp() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("week10d01/gps.data");

        HikingFile hf = new HikingFile();

        Elevations elevations = hf.getPlusElevation(is);

        assertEquals(5, elevations.getFallDown());
        assertEquals(13, elevations.getLiftUp());
    }

}