package zarovizsgapotvizsga1.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {

    public int getNumberOfMales(String path) {
        int counter = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[4].equals("Male")) {
                    counter++;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return counter;
    }
}
