package exam02;

import java.util.Arrays;

public class ArraySelector {

    public String selectEvens(int... numbers) {
        if (numbers.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sb.append(numbers[i]);
            }
        }
        return Arrays.toString(sb.toString().split(""));
    }
}
