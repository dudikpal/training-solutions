package week07.d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week07.d03.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date;

    @BeforeEach
    void setUp() {
        date = new Date(1988, 8, 15);
    }


    @Test
    void testCreateWithNew() {

        assertEquals(1988, date.getYear());
        assertEquals(8, date.getMonth());
        assertEquals(15, date.getDay());
    }

    @Test
    void testWithYear() {
        assertEquals(2001, Date.of(2001, 5, 5).getYear());
        assertEquals(5, Date.of(2001, 5, 16).getMonth());
        assertEquals(8, Date.of(2001, 5, 8).getDay());

    }

}