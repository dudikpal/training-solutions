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

    static void sameTempValues(double[] day, double[] anotherDay) {
        boolean day1Day2 = Arrays.equals(day, anotherDay);

        System.out.println("Az egyik és a másik nap mérései " + (day1Day2 ? "megegyeznek." : "nem egyeznek meg."));
    }

    static boolean wonLottery(int[]megtett, int[]kihuzott) {
        int [] megtettClone = megtett.clone();
        int [] kihuzottClone = kihuzott.clone();
        Arrays.sort(megtettClone);
        Arrays.sort(kihuzottClone);
        if (megtettClone.equals(kihuzottClone)) {
            return true;
        }
         return false;

    }

    public static void main(String[] args) {
        System.out.println(numberOfDaysAsString());

        System.out.println(daysOfWeek());

        multiplicationTableAsString(5);

        double [] day1 = {1.2, 2.5, 2.4, 3.8, 1.9, 4.2, 3.3, 2.9, 2.2, 4.6, 5.0, 4.4};
        double [] day2 = {1.2, 2.5, 2.4, 3.8, 1.9, 4.2, 3.3, 2.9, 2.2, 4.6, 5.0, 4.4};
        double [] day3 = {2.2, 2.5, 2.4, 3.8, 1.9, 4.2, 3.3, 2.9, 2.2, 4.6, 5.0, 4.4};

        sameTempValues(day1, day2);
        sameTempValues(day2, day3);

        int [] megtett = {3, 2, 1}, kihuzott = {1, 2, 3};
        System.out.println(Arrays.toString(megtett));
        System.out.println(Arrays.toString(kihuzott));
        System.out.println("A két tömb számai " +(wonLottery(megtett, kihuzott) ? "megegyeznek!"
 : "Nem egyeznek meg."));
        System.out.println(Arrays.toString(megtett));
        System.out.println(Arrays.toString(kihuzott));
    }
}
