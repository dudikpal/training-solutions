package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SongTest {

    @Test
    void createSong() {
        Song song = new Song("dalcím", 256, "előadó");
        assertEquals("dalcím", song.getName());
        assertEquals(256, song.getLengthInSeconds());
        assertEquals("előadó", song.getArtist());
    }

    @Test
    void emptyName() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Song("", 256, "előadó"));
        assertEquals("The name and artist must not be empty!", ex.getMessage());
    }
}
