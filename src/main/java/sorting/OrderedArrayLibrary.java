package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById() {
        Book[] sortedBooks = getBookArray();
        Arrays.sort(sortedBooks);
        return sortedBooks;
    }

    public Book[] sortingByTitle() {
        Book[] sortedBooks = getBookArray();
        Arrays.sort(sortedBooks, new SortingByTitle());
        return sortedBooks;
    }

    public Book[] getBookArray() {
        return bookArray.clone();
    }
}
