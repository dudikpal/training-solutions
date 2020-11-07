package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi az alábbi feladat megoldása?");
        System.out.println("(11 + 3) * 2 - 4 / 4 =");
        double userResult = scanner.nextDouble();
        double result = (11 + 3) * 2 - 4 / 4;
        if (Math.abs(result - userResult) < 0.0001) {
            System.out.println("Helyesen oldotta meg a feladatot!");
        } else {
            System.out.println("Sajnos nem jó a megoldása.");
        }
    }
}
