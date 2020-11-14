package filescanner;

import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();
    private String path = "/books.csv";

    public void add(Book book) {

    }

    public void saveBooks(String path) {

    }

    public void loadFromFile() {
        try(Scanner scanner = new Scanner(Library.class.getResourceAsStream(path))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                Book book = new Book(line[0], line[1], line[2], line[3]);
                books.add(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
