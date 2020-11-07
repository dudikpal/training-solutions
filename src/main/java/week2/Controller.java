package week2;

import java.util.Scanner;

public class Controller {

    private Office office;
    private static boolean exitCode;

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }

    public void readOffice() {

        office = new Office();
        System.out.println("Hány tárgyaló lesz?");
        Scanner scanner = new Scanner(System.in);
        int cycle = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cycle; i++) {
            System.out.println("Kérem a tárgyaló nevét:");
            String meetingRoomName = scanner.nextLine();
            System.out.println("Kérem a tárgyaló szélességét:");
            int meetingRoomWidth = Integer.parseInt(scanner.nextLine());
            System.out.println("Kérem a tárgyaló hosszát:");
            int meetingRoomLength = Integer.parseInt(scanner.nextLine());
            System.out.println();

            MeetingRoom meetingRoom = new MeetingRoom(meetingRoomName, meetingRoomLength, meetingRoomWidth);
            office.addMeetingRoom(meetingRoom);
        }
    }

    public void printMenu() {
        System.out.println(
            "1. Tárgyalók sorrendben\n" +
            "2. Tárgyalók visszafele sorrendben\n" +
            "3. Minden második tárgyaló\n" +
            "4. Területek\n" +
            "5. Keresés pontos név alapján\n" +
            "6. Keresés névtöredék alapján\n" +
            "7. Keresés terület alapján\n"
        );
    }

    public void runMenu() {

        Scanner scanner = new Scanner(System.in);
        int choosedMenu = Integer.parseInt(scanner.nextLine());

        switch (choosedMenu) {
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEventNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("Kérem a tárgyaló pontos nevét:");
                String meetingRoomName = scanner.nextLine().toString();
                office.printMeetingRoomsWithName(meetingRoomName);
                break;
            case 6:
                System.out.println("Kérem a tárgyaló nevéből egy részletet:");
                String meetingRoomNamePart = scanner.nextLine();
                office.printMeetingRoomsContains(meetingRoomNamePart);
                break;
            case 7:
                System.out.println("Kérem a tárgyaló minimális területét:");
                int meetingRoomArea = Integer.parseInt(scanner.nextLine());
                office.printAreasLargerThan(meetingRoomArea);
                break;
            default:
                System.out.println("1 és 7 közötti szám szükséges");
        }
    }
}
