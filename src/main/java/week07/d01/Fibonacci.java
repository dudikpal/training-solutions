package week07.d01;

public class Fibonacci {

    private long sum = 0;
    private static final Long[] RESULTS = new Long[2000];

    public long fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        if(RESULTS[n] == null) {
            RESULTS[n] = fib(n - 1) + fib(n - 2);
        }
        return RESULTS[n];
    }
}
