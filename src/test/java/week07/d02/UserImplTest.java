package week07.d02;

import org.junit.jupiter.api.Test;
import week07.d02.UserImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {

    @Test
    void testCreate() {
        UserImpl ui = new UserImpl("username", "first", "last");

        assertEquals("username", ui.getUsername());
        assertEquals("first", ui.getFirstName());
        assertEquals("last", ui.getLastName());
    }

    @Test
    void testFullName() {
        UserImpl ui = new UserImpl("username", "first", "last");

        assertEquals("first last", ui.getFullName());
    }
}