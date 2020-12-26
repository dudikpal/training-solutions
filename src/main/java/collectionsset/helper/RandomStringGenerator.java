package collectionsset.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomStringGenerator {

    public Collection<String> createStrings(int length, int count) {
        Collection<String> strings = new ArrayList<>();
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.setLength(0);
            for (int j = 0; j < length; j++) {
                int charCode = 'a' + rnd.nextInt('z' - 'a');
                sb.append((char) charCode);
            }
            strings.add(sb.toString());
        }
        return strings;
    }
}
