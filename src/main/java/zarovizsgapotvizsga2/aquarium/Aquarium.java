package zarovizsgapotvizsga2.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {
    
    private List<Fish> fishes = new ArrayList<>();
    
    public void addFish(Fish fish) {
        fishes.add(fish);
    }
    
    public void feed() {
        fishes.stream().forEach(Fish::feed);
    }
    
    public void removeFish() {
        Iterator<Fish> iterator = fishes.iterator();
        while (iterator.hasNext()) {
            Fish fish = iterator.next();
            if (fish.getWeight() > 10) {
                iterator.remove();
            }
        }
    }
    
    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        for (Fish fish: fishes) {
            statuses.add(fish.status());
        }
        return statuses;
    }
}
