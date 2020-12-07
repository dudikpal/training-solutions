package exceptionclass.course;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {

        this.hour = hourIsValid(hour);
        this.minute = minuteIsValid(minute);
    }

    public SimpleTime(String time) {
        isNull(time);
        String[] timeStr = isTimeFormatValid(time).split(":");
        hour = hourIsValid(Integer.parseInt(timeStr[0]));
        minute = minuteIsValid(Integer.parseInt(timeStr[1]));
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private void isNull(String str) {
        if (str == null || str.isBlank()) {
            throw new InvalidTimeException("Time is null");
        }
    }

    private String isTimeFormatValid(String str) {
        try {
            Integer.parseInt(str.split(":")[0]);
            Integer.parseInt(str.split(":")[1]);
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        return str;
    }

    private int hourIsValid(int hour) {
        if (hour < 0 || 23 < hour) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        return hour;
    }

    private int minuteIsValid(int minute) {
        if (minute < 0 || 59 < minute) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
