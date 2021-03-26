package week14.d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HachikoTest {
    
    
    @Test
    void test() {
        Path path = Path.of("src/main/resources/week14/d05/hachiko.srt");
        assertEquals(4, new Hachiko().countHachiko(path));
    }
    
}