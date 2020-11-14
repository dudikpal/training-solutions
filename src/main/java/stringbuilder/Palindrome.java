package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder sb = new StringBuilder(word);
        String reverseWord = sb.reverse().toString().toLowerCase();
        return word.trim().toLowerCase().equals(reverseWord.trim());
    }
}
