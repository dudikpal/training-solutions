package iofilestest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheeseManagerTest {

    private CheeseManager cm;
    private Cheese controlCheese;
    private Path file;

    @TempDir
    Path folder;

    @BeforeEach
    void setUp() {
        cm = new CheeseManager();
        file = folder.resolve("test.dat");
        List<Cheese> cheeses = List.of(
                new Cheese("trappista", 5.87),
                new Cheese("kavarán", 5.17),
                new Cheese("büdös", 15.8),
                new Cheese("pizzafeltét", 55.8));

        cm.saveToFile(file, cheeses);
        controlCheese = new Cheese("büdös", 15.8);

    }

    @Test
    void findCheese() {

        assertTrue(controlCheese.equals(cm.findCheese(file, "büdös")));
        assertFalse(controlCheese.equals(cm.findCheese(file, "trappista")));

    }

    @Test
    void lactozNumberIsNegative() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Cheese("rossz", -2));
        assertEquals("The number must be positive!", ex.getMessage());
    }

    @Test
    void nameIsEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Cheese("", 2));
        assertEquals("Name is empty or null!", ex.getMessage());
    }
}