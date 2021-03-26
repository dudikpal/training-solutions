package zarovizsgapotvizsga2.uniquefinder;

import java.util.*;

public class UniqueFinder {

    public List<Character> uniqueChars(String string) {
        List<Character> chars = new ArrayList<>();
        if (string == null) {
            throw new IllegalArgumentException("String is null");
        }
        for (char letter: string.toCharArray()) {
            if (!chars.contains(letter)) {
                chars.add(letter);
            }
        }
        
        return chars;
    }
}
