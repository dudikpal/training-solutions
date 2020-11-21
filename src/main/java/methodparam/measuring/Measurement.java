package methodparam.measuring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }

    public double maximum() {
        double maximum = values[0];
        for (double item: values) {
            if (item > maximum) {
                maximum = item;
            }
        }
        return maximum;
    }

    public double minimum() {
        double minimum = values[0];
        for (double item: values) {
            if (item < minimum) {
                minimum = item;
            }
        }
        return minimum;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        int index = 0;
        for (double item: values) {
            if (lower < item && item < upper) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
