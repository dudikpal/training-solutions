package inheritanceconstructor;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        isLessCapacityThanFuelAmount(fuel, tankCapacity);
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        isEnoughFuel(km);
        modifyFuelAmount(fuelRate * km / 100 * -1);
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    private void isEnoughFuel(int km) {
        if (fuelRate * km / 100 > fuel) {
            throw new RuntimeException("Not enough fuel available!");
        }
    }

    private void isLessCapacityThanFuelAmount(double fuel, double capacity) {
        if (fuel > capacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
