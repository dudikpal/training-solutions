package iofilestest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private List<Book> books;
    private Path file;

    @TempDir
    Path folder;

    @BeforeEach
    void setUp() {
        library = new Library();
        file = folder.resolve("test.txt");
        books = List.of(new Book("író1", "cím1"),
                new Book("író2", "cím2"),
                new Book("író1", "cím1"));
    }

    @Test
    void testCreateLibrary() {
        assertTrue(library.getBooks().size() == 0);
    }

    @Test
    void testAddOnlyNewBooks() {

        library.add(books.toArray(new Book[books.size()]));
        assertTrue(library.getBooks().size() == 2);
    }

    @Test
    void testWriteAndReadFromFile() {
        library.add(books.toArray(new Book[books.size()]));

        library.saveBooks(file);
        List<Book> writeBooks = library.getBooks();
        library.loadBooks(file);
        List<Book> readBooks = library.getBooks();

        assertEquals(writeBooks, readBooks);
    }

    @Test
    void testAuthorOrTitleIsEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> library.add(new Book("író1", "")));
        assertEquals("Title is empty or null!", ex.getMessage());

        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> library.add(new Book("", "title")));
        assertEquals("Name is empty or null!", ex1.getMessage());
    }

    @Test
    void testAuthorOrTitleIsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> library.add(new Book(null, "title")));
        assertEquals("Name is empty or null!", ex.getMessage());

        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> library.add(new Book("író1", null)));
        assertEquals("Title is empty or null!", ex1.getMessage());
    }
}