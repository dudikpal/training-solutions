package methodstructure.pendrives;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    List<Pendrive> pendrives = new ArrayList<>();

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive: pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapestPendrive = pendrives.get(0);
        for (int i = 0; i < pendrives.size() - 1; i++) {
            if (pendrives.get(i).cheaperThan(pendrives.get(i + 1))) {
                cheapestPendrive = pendrives.get(i);
            }
        }
        return cheapestPendrive;
    }

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive bestPricePerCapacityPendrive = pendrives.get(0);
        for (int i = 0; i < pendrives.size() - 1; i++) {
            if (pendrives.get(i).comparePricePerCapacity(pendrives.get(i + 1)) < 1) {
                bestPricePerCapacityPendrive = pendrives.get(i);
            }
        }
        return bestPricePerCapacityPendrive;
    }
}
