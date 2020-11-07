package controlselection.week;

import enumtype.week.Day;

import java.util.Scanner;

public class DayOfWeeks {

    public static void main(String[] args) {

        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nap nevét:");
        String inputDay = scanner.nextLine();
        System.out.println(dayOfWeeks.dayAttribute(inputDay));


    }

    public String dayAttribute(String day) {

        day = day.toLowerCase();
        switch (day) {
            case "hétfő":
                return "hét eleje";
            case "kedd":
            case "szerda":
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat":
            case "vasárnap":
                return "hét vége";
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
}
