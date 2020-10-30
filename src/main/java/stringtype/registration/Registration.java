package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validation = new UserValidator();

        System.out.println("Kérem a felhasználói nevet:");
        String userName = scanner.nextLine();
        System.out.println(validation.isValidUserName(userName) ? "Helyes adat." : "Helytelen adat.");

        System.out.println("Kérem az emailcímet:");
        String email = scanner.nextLine();
        System.out.println(validation.isValidEmail(email) ? "Helyes adat." : "Helytelen adat.");

        System.out.println("Kérem a jelszót:");
        String password = scanner.nextLine();
        System.out.println("Kérem a jelszót még egyszer:");
        String passwordAgain = scanner.nextLine();
        System.out.println(validation.isValidPassword(password, passwordAgain) ? "Helyes adat." : "Helytelen adat.");
    }
}
