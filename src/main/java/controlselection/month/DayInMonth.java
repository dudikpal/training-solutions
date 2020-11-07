package controlselection.month;

import java.time.YearMonth;
import java.util.Scanner;

public class DayInMonth {

    public static void main(String[] args) {

        DayInMonth dayInMonth = new DayInMonth();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az évszámot:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Kérem a hónapot betűvel írva:");
        String monthName = scanner.nextLine();
        System.out.println(year + " " + monthName + " napjainak száma: " + dayInMonth.honapNapjai(year, monthName));
    }

    public int honapNapjai(int year, String month) {

        month = month.toLowerCase();
        int monthWithNumber = 0;
        switch (month) {
            case "január":
                monthWithNumber = 1;
                break;
            case "február":
                monthWithNumber = 2;
                break;
            case "március":
                monthWithNumber = 3;
                break;
            case "április":
                monthWithNumber = 4;
                break;
            case "május":
                monthWithNumber = 5;
                break;
            case "június":
                monthWithNumber = 6;
                break;
            case "július":
                monthWithNumber = 7;
                break;
            case "augusztus":
                monthWithNumber = 8;
                break;
            case "szeptember":
                monthWithNumber = 9;
                break;
            case "október":
                monthWithNumber = 10;
                break;
            case "november":
                monthWithNumber = 11;
                break;
            case "december":
                monthWithNumber = 12;
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }


        YearMonth yearMonthObject = YearMonth.of(1999, monthWithNumber);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        return daysInMonth;
    }
}
