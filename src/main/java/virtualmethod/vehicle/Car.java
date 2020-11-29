package virtualmethod.vehicle;

public class Car extends Vehicle{

    private int numberOfPassenger;

    public Car(int vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getGrossLoad() {
        return super.getGrossLoad() + numberOfPassenger * Vehicle.PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", vehicleWeight=" + getVehicleWeight() +
                "}";
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
