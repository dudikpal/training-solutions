package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeValidatorTest {

    @Test
    public void nullParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Palindrome().isPalindrome(null));
        assertEquals("Text must not be null!", ex.getMessage());
    }

    @Test
    public void isPalindrome() {

        assertTrue(new Palindrome().isPalindrome("Racecar"));
        assertFalse(new Palindrome().isPalindrome("start"));
        assertTrue(new Palindrome().isPalindrome(""));
        assertTrue(new Palindrome().isPalindrome("\n\t"));
    }
}
