package week07d04;

import library.NullOrEmpty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ShoppingList {

    public long calculateSum(String path) {

        long sum = 0;
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            for (String line: lines) {
                String[] words = line.split(";");
                sum += Integer.parseInt(words[1]) * Integer.parseInt(words[2]);
                System.out.println(words[0] + " sum: " + Integer.parseInt(words[1]) * Integer.parseInt(words[2]));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("The file is not exist!");
        }
        return sum;
    }
}
