package ioreader.idread;

import library.NullOrEmpty;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();


    public List<String> getIds() {
        return new ArrayList<>(ids);
    }

    public void readIdsFromFile(String path) {
        NullOrEmpty.stringIsNullOrEmpty(path, "Path is null or empty!");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path), Charset.forName("UTF-8"))){
            String line;
            while ((line = reader.readLine()) != null) {
                ids.add(line);
            }
        } catch (IOException ex) {
            throw new IllegalStateException("File not found: " + path, ex);
        }
    }
}
