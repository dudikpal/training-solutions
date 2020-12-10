package ioreadwritebytes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperaturesTest {

    public byte[] data = new byte[365];
    private Temperatures temperatures;

    @BeforeEach
    public void initData() {
        Random random = new Random(5);
        random.nextBytes(data);
        temperatures = new Temperatures(data);
    }


    @Test
    void testWriteAndReadFile() {

        TempreaturesWriter tw = new TempreaturesWriter();
        TemperaturesReader tr = new TemperaturesReader();
        tw.writeTemperatures(temperatures, "src/test/java/ioreadwritebytes/temperatures.dat");

        assertEquals(tr.readTemperatures("src/test/java/ioreadwritebytes/temperatures.dat"), temperatures);    }

    @Test
    void testGetItem() {

        assertEquals(-104, temperatures.getData()[10]);

    }

    @Test
    public void testGetYearAverage() {

        double average = temperatures.getYearAverage();

        assertEquals(3.778, average, 0.0001);
    }

    @Test
    public void testGetMonthAverage() {

        double average = temperatures.getMonthAverage();

        assertEquals(10.2, average, 0.0001);
    }
}