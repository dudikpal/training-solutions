package week11d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Courier {

    private TreeSet<Ride> rides = new TreeSet<>();

    public TreeSet<Ride> getRides() {
        return rides;
    }

    public void fileReading(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                int day = Integer.parseInt(words[0]);
                int task = Integer.parseInt(words[1]);
                int distance = Integer.parseInt(words[2]);
                rides.add(new Ride(day, task, distance));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }

    public Ride firstTask() {
        return rides.first();
    }

    public List<Integer> holidays() {

        Iterator<Ride> value = rides.iterator();
        List<Integer> holidays = new ArrayList<>();
        holidays.add(1);
        holidays.add(2);
        holidays.add(3);
        holidays.add(4);
        holidays.add(5);
        holidays.add(6);
        holidays.add(7);
        while (value.hasNext()) {
            Ride ride = value.next();

            if (holidays.contains(ride.getDay())) {
                holidays.remove((Integer)(ride.getDay()));
            }
        }
        return holidays;
    }

    public int[] distanceOfDays() {
        int[] distances = new int[7];
        Iterator<Ride> value = rides.iterator();
        while (value.hasNext()) {
            Ride ride = value.next();
            distances[ride.getDay() - 1] += ride.getDistance();
        }
        return distances;
    }
}
