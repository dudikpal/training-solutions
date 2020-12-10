package ioreader.idread;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IdManagerTest {
    private IdManager idManager = new IdManager();


    @Test
    void testNullPathString() {
        String pathString = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> idManager.readIdsFromFile(null));
        assertEquals("Path is null or empty!", ex.getMessage());

    }

    @Test
    void testEmptyPathString() {
        String pathString = "";
        Exception ex = assertThrows(IllegalArgumentException.class, () -> idManager.readIdsFromFile(""));
        assertEquals("Path is null or empty!", ex.getMessage());

    }


    @Test
    public void getIdsTest() {
        assertEquals(0, idManager.getIds().size());
        idManager.getIds().add("test");
        assertEquals(0, idManager.getIds().size());


    }


    @Test
    public void readIdFromFileTest() {

        assertEquals(0, idManager.getIds().size());

        idManager.readIdsFromFile("src/test/java/ioreader/idread/idnumbers.txt");

        assertEquals(6, idManager.getIds().size());

    }
}