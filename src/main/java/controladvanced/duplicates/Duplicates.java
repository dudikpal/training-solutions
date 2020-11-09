package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 5);
        Duplicates duplicates = new Duplicates();
        System.out.println(duplicates.findDuplicates(list));
    }

    public List<Integer> findDuplicates(List<Integer> list) {

        List<Integer> distinctList = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        List<Integer> duplicatedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!distinctList.contains(list.get(i))) {
                distinctList.add(list.get(i));
                indexes.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (!indexes.contains(i)) {
                duplicatedList.add(list.get(i));
            }
        }

        return duplicatedList;
    }
}
