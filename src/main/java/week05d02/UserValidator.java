package week05d02;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public void validate(List<User> users) {
        for (User user: users) {
            isStringEmpty(user.getName());
            isAgeValid(user.getAge());
        }
    }

    private void isStringEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Name field must not be empty!");
        }
    }

    private void isAgeValid(int age) {
        if (0 > age || age > 120) {
            throw new IllegalArgumentException("Age must not be positive number, and less than 120 year!");
        }
    }
}
