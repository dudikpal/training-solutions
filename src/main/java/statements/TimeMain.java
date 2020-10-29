package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Első óra:");
        int elsoOra = scanner.nextInt();
        System.out.println("Első perc:");
        int elsoPerc = scanner.nextInt();
        System.out.println("Első másodperc:");
        int elsoMasodperc = scanner.nextInt();
        System.out.println("Másik óra:");
        int masikOra = scanner.nextInt();
        System.out.println("Másik perc:");
        int masikPerc = scanner.nextInt();
        System.out.println("Másik másodperc:");
        int masikMasodperc = scanner.nextInt();

        Time time1 = new Time(elsoOra, elsoPerc, elsoMasodperc);
        Time time2 = new Time(masikOra, masikPerc, masikMasodperc);
        System.out.println(time1.toString());
        System.out.println(time1.getInMinutes());
        System.out.println(time2.toString());
        System.out.println(time2.getInSeconds());
        System.out.println(time1.earlierThan(time2) ? "Az első időpont korábbi." : " A másik időpont korábbi.");
    }
}
