package statements;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getInMinutes() {
        return getHour() * 60 + getMinute();
    }

    public int getInSeconds() {
        return getHour() * 3600 + getMinute() * 60 + getSecond();
    }

    public boolean earlierThan(Time time) {
        return getInSeconds() < time.getInSeconds();
    }

    public String toString() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }
}
