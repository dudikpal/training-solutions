package week07d01;

public class Fibonacci {

    private long sum = 0;

    public long fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
