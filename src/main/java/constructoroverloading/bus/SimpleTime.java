package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        hours = time.getHours();
        minutes = time.getMinutes();
    }

    public int difference(SimpleTime time) {
        int thisTimeToMinutes = hours * 60 + minutes;
        int parameterTimeToMinutes = time.getHours() * 60 + time.getMinutes();
        return thisTimeToMinutes - parameterTimeToMinutes;
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
