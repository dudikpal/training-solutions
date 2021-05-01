package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {

    private List<Coffee> coffees = new ArrayList<>();
    private LocalDateTime dateTime;

    public CoffeeOrder(List<Coffee> coffees, LocalDateTime dateTime) {
        this.coffees = coffees;
        this.dateTime = dateTime;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
