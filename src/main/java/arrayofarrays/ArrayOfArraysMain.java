package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {
    private static int[][] multiplicationTable(int size) {
        int [][] szorzoTabla = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                szorzoTabla[i][j] = (i + 1) * (j + 1);
            }
        }
    return szorzoTabla;
    }

    private static void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] triangularMatrix(int size) {
        int [][] triangMatrix = new int [size][];
        for (int i = 0; i < size; i++) {
            triangMatrix[i] = new int [i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangMatrix[i][j] = i;
            }
        }
        return triangMatrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Szorzótábla dimenziója:");
        printArrayOfArrays(multiplicationTable(scanner.nextInt()));

        System.out.println("A háromszögmátrix mérete:");
        printArrayOfArrays(triangularMatrix(scanner.nextInt()));
    }
}
