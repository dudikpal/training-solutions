package week06.d01;

public class SumOfNumbers {

    private double sumOfPositiveNumbers;
    private double sumOfNegativeNumbers;

    public SumOfNumbers(double sumOfPositiveNumbers, double sumOfNegativeNumbers) {
        this.sumOfPositiveNumbers = sumOfPositiveNumbers;
        this.sumOfNegativeNumbers = sumOfNegativeNumbers;
    }

    public double getSumOfPositiveNumbers() {
        return sumOfPositiveNumbers;
    }

    public double getSumOfNegativeNumbers() {
        return sumOfNegativeNumbers;
    }
}
