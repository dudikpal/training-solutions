package methoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(Time time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEarlier(Time time) {
        if (hours > time.getHours()) {
            if (minutes > time.getMinutes()) {
                if (seconds > time.getSeconds()) {
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (this.hours > hours) {
            if (this.minutes > minutes) {
                if (this.seconds > seconds) {
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean isEqual(Time time) {
        if (hours == time.getHours() && minutes == time.getMinutes() && seconds == time.getSeconds()) {
            return true;
        }
        return false;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (this.hours == hours && this.minutes == minutes && this.seconds == seconds) {
            return true;
        }
        return false;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
