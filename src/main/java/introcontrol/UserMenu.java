package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhsználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();
        if ( menu == 1) {
            System.out.println("Felhasználók listázása");
        } else if (menu == 2) {
            System.out.println("Felhasználó felvétele");
        }

    }
}
