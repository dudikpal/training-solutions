package week10.d05;

public class EdgeNumbers {

    private int min;
    private int max;

    public EdgeNumbers(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "[" + min +
                ", " + max +
                ']';
    }
}
