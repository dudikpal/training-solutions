package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Kérem írja be a nevét:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem az email címét:");
        String email = scanner.nextLine();
        System.out.println("Ön a(z) " + name + " névvel, és a(z) " + email + " email címmel regisztrált.");
    }
}
