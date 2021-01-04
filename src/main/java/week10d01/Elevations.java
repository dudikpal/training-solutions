package week10d01;

public class Elevations {

    private double liftUp;
    private double fallDown;

    public Elevations() {
        this.liftUp = 0;
        this.fallDown = 0;
    }

    public double getLiftUp() {
        return liftUp;
    }

    public double getFallDown() {
        return fallDown;
    }

    public void setLiftUp(double liftUp) {
        this.liftUp += liftUp;
    }

    public void setFallDown(double fallDown) {
        this.fallDown += fallDown;
    }
}
