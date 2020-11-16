package recursion;

public class FactorialCalculator {

    public long getFactorial(int number) {
        if (number > 1) {
            return number * getFactorial(number - 1);
        }
        return 1;
    }
}
