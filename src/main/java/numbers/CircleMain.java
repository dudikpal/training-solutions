package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első kör átmérőjét:");
        int diameter1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Kérem a második kör átmérőjét:");
        int diameter2 = Integer.parseInt(scanner.nextLine());

        Circle circle1 = new Circle(diameter1);
        Circle circle2 = new Circle(diameter2);

        System.out.println("Az első kör kerülete " + circle1.perimeter() + "cm, a területe " + circle1.area() + "cm\u00B2.");
        System.out.println("A második kör kerülete " + circle2.perimeter() + "cm, a területe " + circle2.area() + "cm\u00B2.");

    }
}
