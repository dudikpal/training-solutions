package week08.d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plane {

    public int longestOcean() {

        String path = "src/main/resources/week08/d05/map.txt";
        int counter = 0, max = 0;
        //try (FileInputStream fis = new FileInputStream(path)){
        try (BufferedReader fis = new BufferedReader(Files.newBufferedReader(Path.of(path)))) {
            int input;
            while ((input = fis.read()) != -1) {
                if (input == '0') {
                    counter++;
                } else {
                    if (max < counter) {
                        max = counter;
                    }
                    counter = 0;
                }
            }
        } catch (IOException ex) {

        }
        return max;
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.longestOcean());
    }
}
