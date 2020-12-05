package exceptions.polinom;

public class Polynomial implements ObjectValidator{

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        isNull(coefficients);
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientStrs) {
        isNull(coefficientStrs);
        try {
            coefficients = parserFromStringToDouble(coefficientStrs);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }
    }

    private double[] parserFromStringToDouble(String[] arr) {
        double[] resultArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = Double.parseDouble(arr[i]);
        }
        return resultArray;
    }

    public double evaluate(double x) {
        double sum = 0;
        for (double number: coefficients) {
            sum += number * x;
        }
        return sum;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    @Override
    public void isNull(String[] arr) {
        if (arr == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
    }

    @Override
    public void isNull(double[] arr) {
        if (arr == null) {
            throw new NullPointerException("coefficients is null");
        }
    }
}
