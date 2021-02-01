package week05.d03;

import org.junit.jupiter.api.Test;
import week05.d03.User;
import week05.d03.UserValidator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UserValidatorTest {

    UserValidator uv = new UserValidator();
    List<User> users = new ArrayList<>();

    @Test
    void isStringEmpty() {

        users.add(new User("", 111));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> uv.validate(users));

        assertEquals("Name field must not be empty!", ex.getMessage());
    }

    @Test
    void isAgeUnderZero() {

        users.add(new User("Első", -111));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> uv.validate(users));

        assertEquals("Age must not be positive number, and less than 120 year!", ex.getMessage());
    }

    @Test
    void isAgeMoreThanMax() {

        users.add(new User("Első", 131));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> uv.validate(users));

        assertEquals("Age must not be positive number, and less than 120 year!", ex.getMessage());
    }
}
