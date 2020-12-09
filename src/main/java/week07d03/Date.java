package week07d03;

public class Date {

    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static Date of(int year, int month, int day) {
        return new Date(year, month, day);
    }

    public Date withYear(int year) {
        return of(year, getMonth(), getDay());
    }

    public Date withMonth(int month) {
        return of(getYear(), month, getDay());
    }

    public Date withDay(int day) {
        return of(getYear(), getMonth(), day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
