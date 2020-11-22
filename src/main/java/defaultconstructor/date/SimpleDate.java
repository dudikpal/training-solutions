package defaultconstructor.date;

import java.time.LocalDate;
import java.time.YearMonth;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (year >= 1900 && 0 < month && month < 13 && 0 < day && day <= YearMonth.of(year, month).lengthOfMonth()) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + ", " + month + ", " + day);
        }
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
