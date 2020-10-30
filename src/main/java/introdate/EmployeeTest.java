package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Neve:");
        String name = scanner.nextLine();
        System.out.println("Születési év:");
        int year = scanner.nextInt();
        System.out.println("Születési hónap:");
        int month = scanner.nextInt();
        System.out.println("Születési nap:");
        int day = scanner.nextInt();

        Employee employee1 = new Employee(year, month, day, name);
        System.out.println("Név: " + employee1.getName());
        System.out.println("Született: " + employee1.getDateOfBirth());
        System.out.println("Belépett a céghez: " + employee1.getBeginEmployment());
    }
}
