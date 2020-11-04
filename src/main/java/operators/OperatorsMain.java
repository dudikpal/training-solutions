package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        int number = 100;
        int step = 1; // 2 hatványkitevője

        System.out.println(Integer.toBinaryString(number));

        System.out.println(Integer.toBinaryString(number>>step));
        System.out.println(Integer.parseInt(Integer.toBinaryString(number>>step), 2));

        System.out.println(Integer.toBinaryString(number<<step));
        System.out.println(Integer.parseInt(Integer.toBinaryString(number<<step), 2));

        Operators op = new Operators();
        System.out.println(op.isEven(3));
        System.out.println(op.isEven(4));

        op.multiplyByPowerOfTwo(1000, 3);
        op.multiplyByPowerOfTwo(1000, -2);
    }
}
