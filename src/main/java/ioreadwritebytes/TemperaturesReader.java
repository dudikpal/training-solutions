package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString) {
        try {
            byte[] data = Files.readAllBytes(Path.of(pathString));
            return new Temperatures(data);

        } catch (IOException ex) {
            throw new IllegalStateException("File not found: " + pathString, ex);
        }

    }
}
