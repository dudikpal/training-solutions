package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BookCatalog {

    public static Book findBook(List<Book> books, Book searchedBook) {
        if (!books.contains(searchedBook)) {
            return null;
        }
        return books.get(books.indexOf(searchedBook));
    }

    public static Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedBook = new Book(title, author);
        if (!books.contains(searchedBook)) {
            return null;
        }
        return books.get(books.indexOf(searchedBook));
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> bookSet = new HashSet<>();
        for (Book book: books) {
            bookSet.add(book);
        }
        return bookSet;
    }
}
