package iofilestest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testCreateBook() {
        Book book = new Book("író", "cím");

        assertEquals("író", book.getAuthor());
        assertEquals("cím", book.getTitle());
    }

}