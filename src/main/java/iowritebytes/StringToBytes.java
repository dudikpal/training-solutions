package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> list, Path path) {
        try (OutputStream ops = new BufferedOutputStream(Files.newOutputStream(path))){
            List<String> resultString = new ArrayList<>();
            for (String word:list) {
                if (word.charAt(0) != '_') {
                    resultString.add(word);
                }
            }

            for (int i = 0; i < resultString.size(); i++) {
                byte[] bytes = resultString.get(i).getBytes();
                ops.write(bytes);
            }

        } catch (IOException ex) {
            throw new IllegalStateException("IO error!");
        }
    }
}
