package operators;

public class Operators {

    public boolean isEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public void multiplyByPowerOfTwo(int number, int quotiens) {
        System.out.println(number + " * 2e" + quotiens +  " = " + (quotiens < 0 ? Integer.toBinaryString(number>>Math.abs(quotiens)) : Integer.toBinaryString(number<<quotiens)));
        System.out.println(number + " * 2e" + quotiens +  " = " + (quotiens < 0 ? Integer.parseInt(Integer.toBinaryString(number>>Math.abs(quotiens)), 2) : Integer.parseInt(Integer.toBinaryString(number<<quotiens), 2)));
    }
}
