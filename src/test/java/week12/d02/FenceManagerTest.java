package week12.d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week12.d02.FenceManager;
import week12.d02.Site;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FenceManagerTest {

    private FenceManager fenceManager;

    @BeforeEach
    void setUp() {
        fenceManager = new FenceManager();
        fenceManager.fileReader();

    }

    @Test
    void fileReader() {
        assertEquals(98, fenceManager.getSites().size());
    }

    @Test
    void sortOfWidth() {
        List<Site> result = fenceManager.sortOfWidth();
        assertEquals(8, result.get(0).getWidth());
        assertEquals(20, result.get(result.size() - 1).getWidth());

    }

    @Test
    void lastSiteNumber() {
        assertEquals(78, fenceManager.lastSiteNumber());
    }

    @Test
    void streetView() {
        fenceManager.streetView();
        String line = null;
        try (BufferedReader br = Files.newBufferedReader(Path.of("oddSideView.txt"))){
            line = br.readLine();
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
        assertEquals(1011, line.length());
    }
}