package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers{

    private CanCarryGoods canCarryGoods;
    private CanCarryPassengers canCarryPassengers;

    public FerryBoat(int maxWeight, int maxPassengers) {
        canCarryGoods = new CanCarryGoodsBehaviour(maxWeight);
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
