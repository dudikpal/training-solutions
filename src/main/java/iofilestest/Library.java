package iofilestest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void loadBooks(Path file) {
        books.clear();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                books.add(new Book(line.split(";")[0], line.split(";")[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file, " , ioe);
        }
    }

    public void saveBooks(Path file) {

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))){
            for (Book book: books) {
                pw.print(book.getAuthor());
                pw.print(";");
                pw.println(book.getTitle());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file, ", ioe);
        }
    }

    public void add(Book... booksToAdd) {
        for (Book book: booksToAdd) {
            if (!this.books.contains(book)) {
                this.books.add(book);
            }
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
