package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders = new ArrayList<>();

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void add(CoffeeOrder order) {
        orders.add(order);
    }

    public BigDecimal getTotalIncome() {
        return orders.stream()
                .flatMap(order -> order.getCoffees().stream())
                .map(coffee -> coffee.getPrice())
                .reduce(BigDecimal.ZERO, (acc, price) -> acc.add(price), BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getDateTime().toLocalDate().equals(date))
                .flatMap(order -> order.getCoffees().stream())
                .map(coffee -> coffee.getPrice())
                .reduce(BigDecimal.ZERO, (acc, price) -> acc.add(price), BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream()
                .flatMap(order -> order.getCoffees().stream())
                .filter(coffee -> coffee.getType().equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime dateTime) {
        return orders.stream()
                .filter(order -> order.getDateTime().isAfter(dateTime))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());
    }
}
