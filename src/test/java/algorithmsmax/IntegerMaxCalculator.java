package algorithmsmax;

import java.util.List;

public class IntegerMaxCalculator {

    public int getMaxNumber(List<Integer> numbers) {
        int maxNumber = 0;
        for (Integer number: numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}
