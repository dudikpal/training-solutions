package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérek 2 számot!");
        System.out.println("Első szám:");
        Scanner scanner = new Scanner(System.in);
        int elsoSzam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másik szám:");
        int masikSzam = scanner.nextInt();
        scanner.nextLine();
        System.out.println(elsoSzam + " + " + masikSzam);
        System.out.println(elsoSzam + masikSzam);
    }
}
