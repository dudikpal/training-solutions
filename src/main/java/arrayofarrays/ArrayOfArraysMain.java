package arrayofarrays;

import java.time.LocalDate;
import java.time.LocalTime;
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
                if (a[i][j] < 10){
                    System.out.print("    " + a[i][j]);
                } else if (a[i][j] < 100){
                    System.out.print("   " + a[i][j]);
                } else if (a[i][j] < 1000){
                    System.out.print("  " + a[i][j]);
                }

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

    private static int[][] getValues() {
        int [][] honapok = new int [12][];
        for (int i = 0; i < honapok.length; i++) {
            int days = (LocalDate.of(2019, i + 1, 1)).lengthOfMonth();
            honapok[i] = new int[days];
            for (int j = 0; j < days; j++) {
                honapok[i][j] = j;
            }
        }
        return honapok;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Szorzótábla dimenziója:");
        printArrayOfArrays(multiplicationTable(scanner.nextInt()));

        System.out.println("A háromszögmátrix mérete:");
        printArrayOfArrays(triangularMatrix(scanner.nextInt()));

        System.out.println("A hónapok napjai sorrendben januártól, nem szökőévben:");
        printArrayOfArrays(getValues());
    }
}
