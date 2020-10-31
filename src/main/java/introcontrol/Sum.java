package introcontrol;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("kérek 5 db számot, közöttük enterrel, és kiírom az összegüket:");
        number = scanner.nextInt();
        number += scanner.nextInt();
        number += scanner.nextInt();
        number += scanner.nextInt();
        number += scanner.nextInt();

        System.out.println(number);
    }
}
