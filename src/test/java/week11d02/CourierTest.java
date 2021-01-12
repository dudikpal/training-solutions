package week11d02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void fileReading() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(61, courier.getRides().size());
    }

    @Test
    void firstTask() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);
        Ride elvart = new Ride(1, 1, 3);
        assertEquals(elvart.toString(), courier.firstTask().toString());
    }

    @Test
    void holidays() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(3, courier.holidays().size());
    }

    @Test
    void distanceOfDays() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(12, courier.distanceOfDays());
    }
}