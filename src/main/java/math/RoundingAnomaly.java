package math;

import java.util.Arrays;
import java.util.Random;

public class RoundingAnomaly {

    public static void main(String[] args) {

        RoundingAnomaly ra = new RoundingAnomaly();
        ra.randomNumbers(10, 1000, 5);


        System.out.println();

    }

    double[] randomNumbers(int size, double max, int scale) {

        Random rnd = new Random();
        double [] arr = new double[size];
        double decimals = Math.pow(10, scale);

        for (int i = 0; i < size; i++) {
            arr[i] = Math.floor(rnd.nextDouble() * max * decimals) / decimals;
        }

        return arr;
    }

    double roundAfterSum(double[] numbers) {
        double sum = 0;
        return 0;
    }

}
