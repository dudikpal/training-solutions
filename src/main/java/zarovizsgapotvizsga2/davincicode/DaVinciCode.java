package zarovizsgapotvizsga2.davincicode;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class DaVinciCode {
    
    private final static String validKeys = "10x";
    
    public int encode(String file, char key) {
        if (!validKeys.contains(String.valueOf(key))) {
            throw new IllegalArgumentException("Not valid parameter");
        }
        try (BufferedReader br = Files.newBufferedReader(Path.of(file))){
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                counter += line.toString()
                    .chars()
                    .filter(letter -> letter == key)
                    .count();
            }
            return counter;
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot find file");
        }
    }
}
