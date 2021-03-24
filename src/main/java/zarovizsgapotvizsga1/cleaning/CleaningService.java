package zarovizsgapotvizsga1.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {
    
    private List<Cleanable> cleanables = new ArrayList<>();
    
    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }
    
    public int cleanAll() {
        int sumPrice = 0;
        for (Cleanable building : cleanables) {
            sumPrice += building.clean();
        }
        cleanables.clear();
        return sumPrice;
    }
    
    public int cleanOnlyOffices() {
        int sumPrice = 0;
        List<Cleanable> buildingToRemove = new ArrayList<>();
        for (Cleanable building : cleanables) {
            if (building instanceof Office) {
                sumPrice += building.clean();
                buildingToRemove.add(building);
            }
        }
        removeBuildingByIndexes(buildingToRemove);
        return sumPrice;
    }
    
    private void removeBuildingByIndexes(List<Cleanable> buildingToRemove) {
        for (Cleanable building: buildingToRemove) {
            cleanables.remove(building);
        }
    }
    
    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable building : cleanables) {
            if (building.getAddress().contains(address)) {
                result.add(building);
            }
        }
        return result;
    }
    
    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (Cleanable building : cleanables) {
            sb.append(separator);
            sb.append(building.getAddress());
            separator = ", ";
        }
        return sb.toString();
    }
    
    public List<Cleanable> getCleanables() {
        return cleanables;
    }
}
