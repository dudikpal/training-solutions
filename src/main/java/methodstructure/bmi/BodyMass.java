package methodstructure.bmi;

import static methodstructure.bmi.BmiCategory.*;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public boolean isThinnerThan(BodyMass bodyMass) {
        if (bodyMassIndex() < bodyMass.bodyMassIndex()) {
            return true;
        }
        return false;
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return UNDERWEIGHT;
        }
        if (bodyMassIndex() > 25) {
            return OVERWEIGHT;
        } else {
            return NORMAL;
        }
    }

    public double bodyMassIndex() {
        return weight / Math.pow(height, 2);
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
