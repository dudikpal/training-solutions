package week04.d03;

import javax.swing.plaf.IconUIResource;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int gondoltSzam = rnd.nextInt(100) + 1;
        int szamlalo = 0;
        System.out.println("Gondoltam egy számra 1 és 100 között. Mi a tipped?");

        while (szamlalo < 6) {
            int tipp = Integer.parseInt(scanner.nextLine());
            szamlalo++;
            if (gondoltSzam > tipp) {
                System.out.println("A tippednél nagyobbra gondoltam.");
            } else if (gondoltSzam < tipp) {
                System.out.println("A tippednél kisebbre gondoltam.");
            } else {
                System.out.println("Gratulálok! Sikerült eltalálnod!");
                szamlalo = 8;
            }
        }
        if (szamlalo == 6) {
            System.out.println("Sajnos kifogytál a lehatőségekből, nem találtad el...");
        }
    }
}
