package collectionsiterator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        Iterator<Book> iterator = libraryBooks.iterator();
        Book resultBook;
        while (iterator.hasNext()) {
            resultBook = iterator.next();
            if (resultBook.getRegNumber() == regNumber) {
                return resultBook;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Iterator<Book> iterator = libraryBooks.iterator();
        Book resultBook;
        while (iterator.hasNext()) {
            resultBook = iterator.next();
            if (resultBook.getRegNumber() == regNumber) {
                iterator.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> authorBooks = new HashSet<>();
        Iterator<Book> iterator = libraryBooks.iterator();
        Book resultBook;
        while (iterator.hasNext()) {
            resultBook = iterator.next();
            if (resultBook.getAuthor() == author) {
                authorBooks.add(resultBook);
            }
        }
        if (authorBooks.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return authorBooks;
    }
}
