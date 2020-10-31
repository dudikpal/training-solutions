package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {
    public static int[][] multiplicationTable(int size) {
        int [][] szorzoTabla = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                szorzoTabla[i][j] = (i + 1) * (j + 1);
            }
        }
    return szorzoTabla;
    }

    public static void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Szorzótábla dimenziója:");
        printArrayOfArrays(multiplicationTable(scanner.nextInt()));
    }
}
