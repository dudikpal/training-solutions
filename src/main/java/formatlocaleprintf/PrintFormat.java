package formatlocaleprintf;

import java.util.Locale;

public class PrintFormat {

    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j) {
        try {
            return String.format(new Locale("hu", "HU"), formatString, i, j);
        } catch (IllegalArgumentException ie) {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }
    }

    public String printFormattedText(Double number) {
        String formatString = "Total is: %,.2f Ft";

        return String.format(new Locale("hu", "HU"), formatString, number);

        /*String formatString = "Total is: %,.2f Ft";
        return String.format(new Locale("hu", "HU"), formatString, number);*/
    }

    public String printFormattedText(int count, String fruit) {
        return String.format("We counted %d %s in the basket", count, fruit);
    }

    public String printFormattedText(int number) {
        return String.format("Right edge of numbers set at 4 spaces from text:%4s", Integer.toString(number));
    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        return String.format("Multiple objects containing text:" + i + "\t" + j + "\t" + k);
    }
}
