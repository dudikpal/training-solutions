package week05d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayListTest {

    @Test
    void greaterThan() {
        List<Song> songs = new ArrayList<>(List.of(
                        new Song("cim1", 111, "ea1"),
                        new Song("cim2", 222, "ea2")
        ));

        PlayList pl = new PlayList(songs);
        int mins = 2;

        assertEquals(1, pl.findByLengthGreaterThan(mins).size());
    }
}
