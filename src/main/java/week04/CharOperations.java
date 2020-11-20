package week04;

import java.util.ArrayList;
import java.util.List;



public class CharOperations {



    public List<Integer> getPositionOfChar(String base, String part) {

        List<Integer> charPositions = new ArrayList<>();
        char[] chars = base.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (base.charAt(i) == part.charAt(0)) {
                charPositions.add(i);
            }
        }
        return charPositions;
    }
}
