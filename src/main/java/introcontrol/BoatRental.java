package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a csoport létszámát:");
        int letszam = scanner.nextInt();
        int csonak5 = 5, csonak3 = 3, csonak2 = 2;
        String result = "A következő csónakok hajóztak ki: ";

        if (letszam >= csonak5) {
            letszam -= csonak5;
            result += "(5 személyes) ";
        }

        if (letszam >= csonak3) {
            letszam -= csonak3;
            result += "(3 szemléyes) ";
        }

        if (letszam > 0) {
            letszam -= csonak2;
            result += "(2 személyes).";
        }

        if (letszam > 0) {
            result += " Még " + letszam + "-en maradtak a parton, akiknek nem jutott hajó!";
        }

        System.out.println(result);
    }
}
