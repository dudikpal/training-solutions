package week08.d03;

import library.NullOrEmpty;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    private List<String> shortestWords = new ArrayList<>();

    public List<String> shortestWords(List<String> words) {
        NullOrEmpty.listIsNullOrEmpty(words, "List is null or empty!");
        int shortestLength = shortestWordLength(words);
        return createShortedWordsList(words, shortestLength);
    }

    private List<String> createShortedWordsList(List<String> words, int shortestLength) {
        for (String word: words) {
            if (word.length() == shortestLength) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    private int shortestWordLength(List<String> words) {
        int shortestLength = Integer.MAX_VALUE;
        for (String word: words) {
            NullOrEmpty.stringIsNullOrEmpty(word, "Word is null or empty!");
            if(word.length() < shortestLength) {
                shortestLength = word.length();
            }
        }
        return shortestLength;

    }
}
