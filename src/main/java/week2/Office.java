package week2;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        String roomsName = "";

        for (MeetingRoom room: meetingRooms) {
            roomsName += room.getName() + ", ";
        }

        roomsName = roomsName.substring(0, roomsName.length() - 2);
        System.out.println(roomsName);
    }

    public void printNamesReverse() {
        String roomsName = "";

        for (int i = meetingRooms.size() - 1; i >= 0 ; i--) {
            roomsName += meetingRooms.get(i).getName() + ", ";
        }

        roomsName = roomsName.substring(0, roomsName.length() - 2);
        System.out.println(roomsName);
    }

    public void printEventNames() {
        String roomsName = "";

        for (int i = 0; i < meetingRooms.size(); i += 2) {
            roomsName += meetingRooms.get(i).getName() + ", ";
        }

        roomsName = roomsName.substring(0, roomsName.length() - 2);
        System.out.println(roomsName);
    }

    public void printAreas() {

        for (MeetingRoom resultRoom: meetingRooms) {
            printMethodResult(resultRoom);
        }
    }

    public void printMeetingRoomsWithName(String name) {

        for (MeetingRoom room: meetingRooms) {
            if (room.getName().equals(name)) {
                printMethodResult(room);
                break;
            }
        }
        printMethodResult(null);
    }

    public void printMeetingRoomsContains(String part) {

        part = part.toLowerCase();
        int counter = 0;

        for (MeetingRoom resultRoom: meetingRooms) {
            if (resultRoom.getName().toLowerCase().contains(part)) {
                printMethodResult(resultRoom);
                counter++;
            }
        }
        if (counter == 0) {
            printMethodResult(null);
        }
    }

    public void printAreasLargerThan(int area) {

        int counter = 0;
        for (MeetingRoom resultRoom: meetingRooms) {
            if (resultRoom.getArea() > area) {
                printMethodResult(resultRoom);
                counter++;
            }
        }
        if (counter == 0) {
            printMethodResult(null);
        }
    }

    public void printMethodResult(MeetingRoom meetingRoom) {

        if (meetingRoom == null) {
            System.out.println("Nincs a megadott feltételnek megfelelő találat.");
        } else {
            System.out.println(
                "A " + meetingRoom.getName() +
                " tárgyaló szélessége: " + meetingRoom.getWidth() +
                "m, hosszúsága: " + meetingRoom.getLength() +
                "m, területe: " + meetingRoom.getArea() +
                "m\u00B2."
            );
        }
    }
}
