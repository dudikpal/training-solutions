package week2;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("Java");
        str.add("Python");
        str.add("JavaScript");

        for (String item: str) {
            if (item.length() > 5) {
                System.out.println(item);
            }
        }
    }
}
