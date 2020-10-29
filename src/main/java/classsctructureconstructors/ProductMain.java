package classsctructureconstructors;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("Kérem a termék nevét:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem a termék árát:");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product1 = new Product(name, price);
        System.out.println("A(z) " + product1.getName() + " ára: " + product1.getPrice() + "Ft.");
        System.out.println("Hány Ft-tal emelkedjen a termék ára?");
        product1.increasePrice(scanner.nextInt());
        System.out.println("A(z) " + product1.getName() + " ára: " + product1.getPrice() + "Ft.");
        System.out.println("Hány Ft-tal csökkenjen a termék ára?");
        product1.decreasePrice(scanner.nextInt());
        System.out.println("A(z) " + product1.getName() + " ára: " + product1.getPrice() + "Ft.");
    }
}
