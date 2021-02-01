package week07.d05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import week07.d05.SaveInput;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SaveInputTest {
    @TempDir
    public Path tempDirectory;

    @Test
    void testCreate() {

        Scanner scanner = new Scanner("aaa\nbbb\nccc");
        SaveInput si = new SaveInput(scanner);
        List<String> datas = si.readLine();

        assertEquals(List.of("aaa", "bbb", "ccc"), datas);

    }

    @Test
    void testWrite() throws IOException {
        SaveInput si = new SaveInput(new Scanner(System.in));

        Path file = tempDirectory.resolve("alma.txt");
        System.out.println(file);
        System.out.println(tempDirectory);
    }

}