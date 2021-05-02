package lambdacollectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders = new ArrayList<>();

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addCoffeeOrder(CoffeeOrder order) {
        orders.add(order);
    }

    public Map<CoffeeType, Long> getCountByCoffeeType() {
        return orders.stream()
            .flatMap(order -> order.getCoffeeList().stream())
            .collect(Collectors.groupingBy(x -> x.getType(), Collectors.counting()));
    }

    public double getAverageOrder() {
        return orders.stream()
                .collect(Collectors.averagingInt(x -> x.getCoffeeList().size()));
    }
}
