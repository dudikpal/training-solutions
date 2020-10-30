package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int number) {
        return number <= 10 ? number : number - 10;
    }

    public String describeNumber(int number) {
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name) {
        return name.equals("Joe") ? "Hello " + name : "";
    }

    public int calculateBonus(int sale) {
        return sale >= 1000000 ? (int)(sale * 0.1) : 0;
    }

    public int calculateConsumption(int prev, int next) {
        return prev > next ? Math.abs(9999 - prev + next) : Math.abs(next -prev);
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = Math.min(min, max) + 1; i < Math.max(min, max); i++) {
            System.out.print(i + ", ");
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for ( int i = a -1; i > b;i--) {
                System.out.print(i + ", ");
            }
        } else {
            for (int i = a + 1; i < b; i++) {
                System.out.print(i + ", ");
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i < max;i+=2) {
            System.out.print(i + ", ");
        }
        if (max % 2 != 0) System.out.print(max);
    }
}
