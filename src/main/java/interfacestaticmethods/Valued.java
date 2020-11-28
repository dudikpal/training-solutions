package interfacestaticmethods;

import java.util.List;

public interface Valued {

    static double totalValue(List<Valued> products) {
        double sumOfPrice = 0;
        for (Valued product: products) {
            sumOfPrice += product.getValue();
        }
        return sumOfPrice;
    }

    double getValue();
}
