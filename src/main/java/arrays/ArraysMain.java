package arrays;

import java.time.LocalDate;

import static java.time.LocalDate.*;

public class ArraysMain {

    String numberOfDaysAsString() {
        int [] numberOfDays = new int [12];
        for (int i = 0; i < 12; i++) {
            numberOfDays[i] = (of(2019, i + 1, 1)).lengthOfMonth();
        }
        return numberOfDays.toString();
    }
}
