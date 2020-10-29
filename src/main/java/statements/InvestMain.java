package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a befektetett összeget:");
        int fund = scanner.nextInt();
        System.out.println("Kérem a kamatlábat:");
        int interestRate = scanner.nextInt();
        Investment invest1 = new Investment(fund, interestRate);

        System.out.println("Befektetés összege:");
        System.out.println(invest1.getFund());
        System.out.println("Kamatláb:");
        System.out.println(invest1.getInterestRate());
        System.out.println("Tőke:" + invest1.getFund());
        System.out.println("Hozam 50 napra: " + invest1.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + invest1.close(80));
        System.out.println("Kivett öszeg 90 nap után: " + invest1.close(90));
    }
}
