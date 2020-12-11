package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path path;

    public NameWriter(Path fileName) {
        path = fileName;
    }

    public void addAndWrite(String name) {
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND)){
            bw.write(name + "\n");
        } catch (IOException ex) {
            throw new IllegalStateException("File not found!", ex);
        }
    }
}
