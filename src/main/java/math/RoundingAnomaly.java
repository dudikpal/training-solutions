package math;

import java.util.Arrays;
import java.util.Random;

public class RoundingAnomaly {

    public static void main(String[] args) {

        RoundingAnomaly ra = new RoundingAnomaly();
        double[] avg = new double[100];

        for (int i = 0; i < 100; i++) {
            avg[i] = ra.difference(1000, 1000000, 5);
        }

        System.out.println(Arrays.stream(avg).sum() / 100);


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
        for (double item: numbers) {
            sum += item;
        }
        return Math.round(sum);
    }

    double sumAfterRound(double[] numbers) {
        double sum = 0;

        for (double item: numbers) {
            sum += Math.round(item);
        }
        return sum;
    }

    double difference(int size, double max, int scale) {

        double[] arr = randomNumbers(size, max, scale);

        return Math.abs(roundAfterSum(arr) - sumAfterRound(arr));
    }



}
