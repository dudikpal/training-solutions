package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();



    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public String toString() {
        return satellites.toString();
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        isEmpty(registerIdent);
        for (Satellite satellite: satellites) {
            if (satellite.getRegisterIdent().equals(registerIdent)) {
                return satellite;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Registernumber must not be empty!");
        }
        return false;
    }
}
