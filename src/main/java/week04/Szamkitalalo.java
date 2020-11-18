package week04;

import java.util.Random;
import java.util.Scanner;

public class Szamkitalalo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int gondoltSzam = rnd.nextInt(100);
        int szamlalo = 0;
        System.out.println("Gondoltam egy számra 1 és 100 között. Mi a tipped?");

        while (szamlalo < 6) {
            int tipp = Integer.parseInt(scanner.nextLine());
            if (gondoltSzam > tipp) {
                System.out.println("A tippednél nagyobbra gondoltam.");
                szamlalo++;
            } else if (gondoltSzam < tipp) {
                System.out.println("A tippednél kisebbre gondoltam.");
                szamlalo++;
            } else {
                System.out.println("Gratulálok! Sikerült eltalálnod!");
                szamlalo = 10;
                break;
            }
        }
        if (szamlalo != 10) {
            System.out.println("Sajnos kifogytál a lehatőségekből, nem találtad el...");
        }
    }
}
