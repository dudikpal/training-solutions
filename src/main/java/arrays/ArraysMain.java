package arrays;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.time.LocalDate.*;

public class ArraysMain {

    static String numberOfDaysAsString() {
        int [] numberOfDays = new int [12];
        for (int i = 0; i < 12; i++) {
            numberOfDays[i] = (of(2020, i + 1, 1)).lengthOfMonth();
        }
        return Arrays.toString(numberOfDays);
    }

    static List<String> daysOfWeek() {
        String [] napok = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        return Arrays.asList(napok);
    }

    static void multiplicationTableAsString(int size) {
        int [][] szorzoTabla = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                szorzoTabla[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(szorzoTabla));
    }

    public static void main(String[] args) {
        System.out.println(numberOfDaysAsString());

        System.out.println(daysOfWeek());

        multiplicationTableAsString(5);
    }
}
