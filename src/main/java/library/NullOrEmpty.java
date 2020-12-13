package library;

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

}
