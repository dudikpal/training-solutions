package week06d01;

import java.util.List;

public class SeparatedSum {

    public SumOfNumbers sum(String s) {
        List<String> numberStrings = List.of(s.split(";"));
        double sumOfPositives = 0;
        double sumOfNegatives = 0;

        for (String str: numberStrings) {
            String numberWithDot = str.replace(",", ".");
            double number = Double.parseDouble(numberWithDot);
            if (number < 0) {
                sumOfNegatives += number;
            } else {
                sumOfPositives += number;
            }
        }
        return new SumOfNumbers(sumOfPositives, sumOfNegatives);
    }
}
