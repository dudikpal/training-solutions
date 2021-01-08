package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Kérem a számokat, enterrel elválasztva, ha nem kíván több számot beírni, akkor adja be az \"x\" betűt:");

        Calculator calculator = new Calculator();
        System.out.println(calculator.findMinMaxSum(calculator.getNumbersArrayFromInput()));
    }

    public EdgeNumbers findMinMaxSum(int[] arr) {
        Arrays.sort(arr);
        int minSum = 0;
        int maxSum = 0;
        if (arr.length > 4) {
            for (int i = 0; i < 4; i++) {
                minSum += arr[i];
                maxSum += arr[arr.length - i - 1];
            }
        } else {
            minSum = maxSum = Arrays.stream(arr).sum();
        }
        return new EdgeNumbers(minSum, maxSum);
    }

    private int[] getNumbersArrayFromInput() {
        Scanner scanner = new Scanner(System.in);
        String numberString;
        List<Integer> numbersList = new ArrayList<>();
        try {
            while ((numberString = scanner.nextLine()) != "x") {
                numbersList.add(Integer.parseInt(numberString));
            }
        } catch (NumberFormatException nfe) {

        }
        int[] numbersArray = new int[numbersList.size()];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = numbersList.get(i);
        }
        return numbersArray;
    }
}
