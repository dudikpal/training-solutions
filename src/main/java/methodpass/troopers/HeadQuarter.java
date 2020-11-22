package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public void moveClosestTrooper(Position target) {
        isObjectNull(target);
        moveTrooper(findClosestTrooper(target), target);
    }

    public void moveTrooperByName(String name, Position target) {
        isStringNullOrEmpty(name);
        isObjectNull(target);
        moveTrooper(findTrooperByName(name), target);
    }

    private void moveTrooper(Trooper trooper, Position target) {
        for (Trooper item: troopers) {
            if (item == trooper) {
                item.changePosition(target);
            }
        }
    }

    private Trooper findClosestTrooper(Position target) {
        isObjectNull(target);
        Trooper closestTrooper = null;
        double distance = troopers.get(0).distanceFrom(target);
        for (Trooper trooper: troopers) {
            if (trooper.distanceFrom(target) <= distance) {
                distance = trooper.distanceFrom(target);
                closestTrooper = trooper;
            }
        }
        return closestTrooper;
    }

    public void addTrooper(Trooper trooper) {
        isObjectNull(trooper);
        troopers.add(trooper);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper: troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        throw new IllegalArgumentException(name + " trooper doesn't exist!");
    }

    private void isObjectNull(Object object) {
        if(object == null) {
            throw new IllegalArgumentException("Trooper is must not be null!");
        }
    }

    private void isStringNullOrEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Name is must not be empty or null!!");
        }
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }
}
