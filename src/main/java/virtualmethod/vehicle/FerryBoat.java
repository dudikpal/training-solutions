package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    private final int MAX_CARRY_WEIGHT;
    private Car car;

    public FerryBoat(int MAX_CARRY_WEIGHT) {
        super(MAX_CARRY_WEIGHT);
        this.MAX_CARRY_WEIGHT = MAX_CARRY_WEIGHT;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() < MAX_CARRY_WEIGHT ? true : false;
    }

    public boolean load(Car car) {
        if (car.getGrossLoad() < MAX_CARRY_WEIGHT) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{car=" + car.toString() + "}";
    }
}
