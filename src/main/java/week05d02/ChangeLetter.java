package week05d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeLetter {

    private final String vowels = "aeiou";

    public String changeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char strletter: str.toCharArray()) {
            if (vowels.contains("" + strletter)) {
                sb.append("*");
            } else {
                sb.append(strletter);
            }
        }
        return sb.toString();
    }
}
