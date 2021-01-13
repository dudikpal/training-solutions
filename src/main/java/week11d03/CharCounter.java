package week11d03;

import collectionsmap.Entry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharCounter {

    public int countChars(String[] chars) {
        HashMap<Character, Integer> charCounter = new HashMap<>();
        for (String word: chars) {
            for (int i = 0; i < word.length(); i++) {
                if (charCounter.containsKey(word.charAt(i))) {
                    charCounter.put(word.charAt(i), charCounter.get(word.charAt(i)) + 1);
                } else {
                    charCounter.put(word.charAt(i), 1);
                }
            }
        }
        int counter = 0;
        for (int number: charCounter.values()) {
            if (number >= chars.length) {
                counter++;
            }
        }
        return counter;
    }
}
