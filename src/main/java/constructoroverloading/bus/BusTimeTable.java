package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
       createTimeTable(firstHour, lastHour, everyMinute);
    }

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public SimpleTime firstBusOfTheDay() {
        System.out.println(nextBus(new SimpleTime(0, 0)));
        return nextBus(new SimpleTime(0, 0));
    }

    private void createTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, everyMinute));
        }
    }

    public SimpleTime nextBus(SimpleTime actual) {
        SimpleTime nextBus = null;
        int difference = 24 * 60;  // 1 day
        for (SimpleTime time: timeTable) {
            if (getTimeInMinutes(actual) < getTimeInMinutes(time)) {
                if (difference > getTimeInMinutes(time) - getTimeInMinutes(actual)) {
                    nextBus = time;
                    difference = getTimeInMinutes(time) - getTimeInMinutes(actual);
                }
            }
        }
        if (nextBus == null) {
            throw new IllegalStateException("No more buses today!");
        }
        return nextBus;
    }

    private SimpleTime getMinutesToSimpleTime(int minutes) {
        return new SimpleTime(minutes / 60, minutes % 60);
    }

    private int getTimeInMinutes(SimpleTime time) {
        return time.getHours() * 60 + time.getMinutes();
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }
}
