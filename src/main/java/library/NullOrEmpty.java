package library;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class NullOrEmpty {
    public static void objectIsNull(Object object, String exMessage) {
       if (object == null) {
           throw new IllegalArgumentException(exMessage);
       }
    }

    public static void listIsEmpty(List<?> list, String exMessage) {
        if (list.size() == 0) {
            throw new IllegalArgumentException(exMessage);
        }
    }


}
