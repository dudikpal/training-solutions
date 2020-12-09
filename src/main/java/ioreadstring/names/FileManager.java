package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();


    public FileManager(String stringPath) {
        myFile = Path.of(stringPath);
    }

    public void readFromFile() {
        try {
            List<String> names = Files.readAllLines(myFile);
            for (String name: names) {
                humans.add(new Human(name.split(" ")[0], name.split(" ")[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file:" + myFile);
        }
    }

    public List<Human> getHumans() {
        return humans;
    }

    public Path getMyFile() {
        return myFile;
    }
}
