package inheritanceconstructor;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        isLessCapacityThanFuelAmount(extraFuel, extraCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        if (extraFuel + fuel < 0) {
            super.modifyFuelAmount(extraFuel + fuel);
            extraFuel = 0;
        } else {
            extraFuel += fuel;
        }
    }

    public void drive(int km) {
        isEnoughFuel(km);
        modifyFuelAmount(super.getFuelRate() * km / 100 * -1);
    }

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    private void isEnoughFuel(int km) {
        if (super.getFuelRate() * km / 100 > super.getFuel() + extraFuel) {
            throw new RuntimeException("Not enough fuel available!");
        }
    }

    private void isLessCapacityThanFuelAmount(double fuel, double capacity) {
        if (fuel > capacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
