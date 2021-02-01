package week07.d05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {

    private Scanner scanner;

    public SaveInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> readLine() {
        //scanner = new Scanner(SaveInput());
        SaveInput si = new SaveInput(scanner);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Kérem a(z) " + (i + 1) +" sort:");
            datas.add(scanner.nextLine());
        }
        return datas;
    }

    private Path readFileName() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a fájl nevét:");
        String path = "src/main/java/week07d05/";
        path += scanner.nextLine();
        return Path.of(path);
    }

    private void write(Path path, List<String> lines) {
        try {
            Files.write(path, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            throw new IllegalStateException("No file", ex);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SaveInput si = new SaveInput(scanner);
        List<String> datas = si.readLine();
        Path path = si.readFileName();
        si.write(path, datas);
    }

}
