package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Path.of("books.csv"));) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine().toString());
            }
        } catch (IOException ie) {
            System.out.println("Hiba történt fájlművelet közben!");
            ie.printStackTrace();
        }
    }


}
