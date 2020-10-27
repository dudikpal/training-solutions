package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a nevét:");
        client.name = scanner.nextLine();
        System.out.println("Kérem a születési évét:");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a címét:");
        client.address = scanner.nextLine();
        System.out.println("Neve: " + client.name + ", születési éve: " + client.year + ", címe: " + client.address + ".");
    }
}
