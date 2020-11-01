package finalmodifier;

import java.util.PrimitiveIterator;
import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {

    double calculateVolume(double r, double h) {
        return PI * r * r * h;
    }

    double calculateSurfaceArea(double r, double h) {
        return 2 * PI * r * r + 2 * PI * r * h;
    }
}
