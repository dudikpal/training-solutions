package catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validators {

    public static boolean isBlank(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isZeroOrNegative(int number) {
        if (number < 1) {
            return true;
        }
        return false;
    }


}
