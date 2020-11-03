package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());

        Book emptyBook;
        //System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null ? "true" : "false");

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook ? "true" : "false");

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(anotherBook == book ? "true" : "false");

        System.out.println(anotherBook instanceof Book);

        // a végére 3 objektum jön létre, és 2-höz lehet hozzáférni

        Book[] bookArray =  {new Book(), new Book(), new Book()};

        List<Book> bookList = new ArrayList<>();
        bookList = Arrays.asList(bookArray);
        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());

    }
}
