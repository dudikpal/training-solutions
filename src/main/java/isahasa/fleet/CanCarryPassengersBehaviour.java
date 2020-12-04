package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passengers = 0;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        if (maxPassengers - passengers < 0) {
            this.passengers = maxPassengers;
            return passengers - maxPassengers;
        }
        this.passengers = passengers;
        return 0;

    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
