package controlselection.greetings;

import statements.Time;

import java.time.format.DateTimeFormatter;

public class Greetings {

    public static void main(String[] args) {

        Greetings greetings = new Greetings();

        greetings.greeting(5, 13);
        greetings.greeting(9, 13);
        greetings.greeting(19, 13);
        greetings.greeting(4, 13);

    }

    public void greeting(int hour, int minutes) {
        int time = hour * 60 + minutes;

        switch (
            300 <= time && time < 540 ? 1 :
            540 <= time && time < 1110 ? 2 :
            1110 <= time && time < 1200 ? 3 : 4
        )
        {
            case 1:
                System.out.println("Jó reggelt!");
                break;
            case 2:
                System.out.println("Jó napot!");
                break;
            case 3:
                System.out.println("Jó estét!");
                break;
            case 4:
                System.out.println("Jó éjt!");
                break;
            default:
                System.out.println("0 és 24 közötti számot kell megadni!");
        }
    }
}
