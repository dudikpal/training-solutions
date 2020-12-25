package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public Book getFirstBook(List<Book> firstBook) {
        if (firstBook == null) {
            throw new NullPointerException();
        }
        if (firstBook.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        return firstBook.get(0);
    }
}
