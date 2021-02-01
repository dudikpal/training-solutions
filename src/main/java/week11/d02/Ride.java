package week11.d02;

public class Ride implements Comparable<Ride>{

    private int day;
    private int task;
    private int distance;

    public Ride(int day, int task, int distance) {
        this.day = day;
        this.task = task;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getTask() {
        return task;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Ride o) {
        return (this.getDay() * 100 + this.getTask()) - (o.getDay() * 100 + o.getTask());
    }

    @Override
    public String toString() {
        return "Ride{" +
                "day=" + day +
                ", task=" + task +
                ", distance=" + distance +
                '}';
    }
}
