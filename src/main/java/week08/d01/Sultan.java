package week08.d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sultan {

    private int days;
    private boolean[] doors;
    private List<Integer> openedDoors;

    public Sultan(int days) {
        this.days = days;
        doors = new boolean[days];
    }

    public int openDoors() {
        openedDoors = new ArrayList<>();
        for (int i = 1; i < days + 1; i++) {
            for (int j = 1; j < days + 1; j++) {
                if (i % j == 0) {
                    doors[i - 1] = !doors[i - 1];
                }
            }
        }
        int result = 0;
        for (int i = 0; i < days; i++) {
            if (doors[i]) {
                openedDoors.add(i + 1);
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Sultan s = new Sultan(100);
        System.out.println(s.openDoors());
        System.out.println(Arrays.toString(s.openedDoors.toArray()));
    }
}
