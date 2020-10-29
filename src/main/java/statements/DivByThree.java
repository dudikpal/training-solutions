package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int szam = scanner.nextInt();
        System.out.println(szam % 3 == 0 ? "Osztható 3-mal" : "Nem osztható 3-mal");
    }
}
