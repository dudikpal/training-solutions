package week14.d05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Hachiko {

    public int countHachiko(Path path) {
        try (Stream<String> stream = Files.lines(path)){
            return (int)stream
                .filter(line -> line.contains("Hachiko"))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.contains("Hachiko"))
                .count();
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
    }
}
