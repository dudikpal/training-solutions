package methoverloading.pub;

import methoverloading.Time;

public class Pub {

    private String name;
    private Time openFrom;

    public Pub(String name, Time time) {
        this.name = name;
        openFrom = openFrom;
    }

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        openFrom = new Time(hours, minutes);
    }

    public String toString() {
        return name + ";" + openFrom.getHours() + ":" + openFrom.getMinutes();
    }

    public String getName() {
        return name;
    }

    public Time getOpenFrom() {
        return openFrom;
    }
}
