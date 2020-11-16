package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NameChangerTest {

    @Test
    void testChangeFirstName() {
        NameChanger nameChanger = new NameChanger("John Doe");

        nameChanger.changeFirstName("Jack");

        assertEquals("Jack Doe", nameChanger.getFullName());
    }
}
