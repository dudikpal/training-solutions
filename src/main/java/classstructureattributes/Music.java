package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Kedvenc zeneszerződ?");
        song.band = scanner.nextLine();
        System.out.println("Kedvenc számod tőle?");
        song.title = scanner.nextLine();
        System.out.println("Zeneszám hossza percben?");
        song.length = scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band + ", " + song.title + " (" + song.length + " perc)");
    }
}
