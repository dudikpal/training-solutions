package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();
        int lessTen = 6, moreTen = 12;
        System.out.println(lessTen + "-nél: " + ic.substractTenIfGreaterThanTen(lessTen));
        System.out.println(moreTen + "-nél: " + ic.substractTenIfGreaterThanTen(moreTen));

        System.out.println(ic.describeNumber(lessTen));
        System.out.println(ic.describeNumber(0));

        System.out.println(ic.greetingToJoe("Jon"));
        System.out.println(ic.greetingToJoe("Joe"));

        System.out.println("Jutalék: " + ic.calculateBonus(990000));
        System.out.println("Jutalék: " + ic.calculateBonus(1990000));

        System.out.println("Fogyasztás: " + ic.calculateConsumption(1111, 5678));
        System.out.println("Fogyasztás: " + ic.calculateConsumption(7896, 5678));

        ic.printNumbers(73);
        System.out.println();
        ic.printNumbersBetween(11, 33);
        System.out.println();
        ic.printNumbersBetween(41, 33);
        System.out.println();

        ic.printNumbersBetweenAnyDirection(4,10);
        System.out.println();
        ic.printNumbersBetweenAnyDirection(24,10);
        System.out.println();

        ic.printOddNumbers(33);
        System.out.println();
        ic.printOddNumbers(32);
        System.out.println();
    }
}
