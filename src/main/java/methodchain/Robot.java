package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;
    private List<NavigationPoint> navigationList = new ArrayList<>();

    public List<NavigationPoint> getNavigationList() {
        return navigationList;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(new NavigationPoint(distance, azimut));
        return this;
    }

    public Robot rotate(int angle) {
        azimut += angle;
        return this;
    }

    public Robot go(int meter) {
        distance += meter;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }
}
