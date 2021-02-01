package week06.d01;

import java.util.List;

public class SeparatedSum {

    public SumOfNumbers sum(String s) {
        String numberWithDot = s.replace(",", ".");
        List<String> numberStrings = List.of(numberWithDot.split(";"));
        double sumOfPositives = 0;
        double sumOfNegatives = 0;

        for (String str: numberStrings) {
            double number = Double.parseDouble(str);
            if (number < 0) {
                sumOfNegatives += number;
            } else {
                sumOfPositives += number;
            }
        }
        return new SumOfNumbers(sumOfPositives, sumOfNegatives);
    }
}
