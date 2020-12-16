package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ByteChecker {

    public static void main(String[] args) {
        ByteChecker bc = new ByteChecker();
        bc.readBytesAndFindAs("src/main/resources/ioreadbytes/byteacount/data.dat");
    }

    public int readBytesAndFindAs(String fileName) {
        Path path = Path.of(fileName);
        bytesWriter(path);
        try (InputStream is = new BufferedInputStream(Files.newInputStream(path))){
            int aCounter = 0;
            byte[] chars = is.readAllBytes();
            for (byte letter: chars) {
                if ((char)letter == 'a') {
                    aCounter++;
                }

            }

            return aCounter;
        } catch (IOException ex) {
            throw new IllegalStateException("Cant read file");
        }
    }

    private void bytesWriter(Path path) {
        try {
           byte[] bytes = "ahldfigauefbevauhertfhbvfaudfbdbanboaboubaoubaoubaa".getBytes();
           Files.write(path, bytes);
        } catch (IOException ex) {
            throw new IllegalStateException("Cant write file");
        }
    }
}
