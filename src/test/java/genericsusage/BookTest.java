package genericsusage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testCreateBook() {
        Book book = new Book("cím");
        String title = "cím";
        assertEquals(title, book.getTitle());
    }

}