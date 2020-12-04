package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void loadShip(int passengers, int cargoWeight) {
        waitingPersons = passengers;
        waitingCargo = cargoWeight;
        for (Ship ship: ships) {
            if (ship instanceof CanCarryPassengers) {
                waitingPersons = ((CanCarryPassengers) ship).loadPassenger(waitingPersons);
            }
            if (ship instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) ship).loadCargo(waitingCargo);
            }
        }
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
