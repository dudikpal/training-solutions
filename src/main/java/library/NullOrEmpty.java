package library;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NullOrEmpty {
    public static void objectIsNull(Object object, String exMessage) {
       if (object == null) {
           throw new IllegalArgumentException(exMessage);
       }
    }

    public static void listIsNullOrEmpty(List list, String exMessage) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException(exMessage);
        }
    }

    public static void stringIsNullOrEmpty(String str, String exMessage) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException(exMessage);
        }
    }

    public static void arrayIsEmpty(Object array, String exMessage) {
        if (array == null || !array.getClass().isArray() || Array.getLength(array) == 0) {
            throw new IllegalArgumentException(exMessage);
        }
    }

    public static void numberIsNegative(Object number, String exMessage) {
        if (Double.parseDouble(number.toString()) < 0) {
            throw new IllegalArgumentException("The number cannot be negative!");
        }
    }

}
