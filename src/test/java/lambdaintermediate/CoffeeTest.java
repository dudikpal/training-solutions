package lambdaintermediate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CoffeeTest {

    private List<CoffeeOrder> orders = new ArrayList<>();

    @BeforeEach
    public void initializeOrders() {
        Coffee espresso = new Coffee(CoffeeType.ESPRESSO, new BigDecimal(4.9));
        Coffee machiatto = new Coffee(CoffeeType.MACHIATTO, new BigDecimal(5.5));
        Coffee ristretto = new Coffee(CoffeeType.RISTRETTO, new BigDecimal(4.9));
        Coffee cappuccino = new Coffee(CoffeeType.CAPPUCCINO, new BigDecimal(8.9));
        Coffee latte = new Coffee(CoffeeType.LATTE, new BigDecimal(8.9));
        Coffee americano = new Coffee(CoffeeType.AMERICANO, new BigDecimal(5.9));
        Coffee mocha = new Coffee(CoffeeType.MOCHA, new BigDecimal(6.2));

        LocalDate date1 = LocalDate.of(2018, 5, 3);
        LocalDate date2 = LocalDate.of(2018, 5, 4);
        LocalDate date3 = LocalDate.of(2018, 5, 5);
        LocalDate date4 = LocalDate.of(2018, 5, 6);

        LocalTime time1 = LocalTime.of(9, 10);
        LocalTime time2 = LocalTime.of(9, 19);
        LocalTime time3 = LocalTime.of(9, 37);
        LocalTime time4 = LocalTime.of(10, 3);
        LocalTime time5 = LocalTime.of(11, 20);
        LocalTime time6 = LocalTime.of(11, 58);
        LocalTime time7 = LocalTime.of(12, 29);
        LocalTime time8 = LocalTime.of(14, 1);

        orders.add(new CoffeeOrder(Arrays.asList(espresso, espresso, ristretto), LocalDateTime.of(date1, time3)));
        orders.add(new CoffeeOrder(Arrays.asList(cappuccino), LocalDateTime.of(date2, time1)));
        orders.add(new CoffeeOrder(Arrays.asList(americano, americano), LocalDateTime.of(date1, time4)));
        orders.add(new CoffeeOrder(Arrays.asList(latte, mocha), LocalDateTime.of(date1, time2)));
        orders.add(new CoffeeOrder(Arrays.asList(machiatto, espresso, machiatto), LocalDateTime.of(date2, time2)));
        orders.add(new CoffeeOrder(Arrays.asList(espresso, americano), LocalDateTime.of(date4, time7)));
        orders.add(new CoffeeOrder(Arrays.asList(mocha, latte, cappuccino), LocalDateTime.of(date3, time8)));
        orders.add(new CoffeeOrder(Arrays.asList(ristretto, mocha), LocalDateTime.of(date3, time5)));
        orders.add(new CoffeeOrder(Arrays.asList(latte, espresso), LocalDateTime.of(date1, time6)));
        orders.add(new CoffeeOrder(Arrays.asList(americano, ristretto), LocalDateTime.of(date1, time5)));
        orders.add(new CoffeeOrder(Arrays.asList(espresso), LocalDateTime.of(date1, time4)));
        orders.add(new CoffeeOrder(Arrays.asList(mocha, espresso, cappuccino), LocalDateTime.of(date1, time8)));
    }

    @AfterEach
    public void destroyOrders() {
        orders = null;
    }

    @Test
    public void getTotalIncome() {
        Cafe Cafe = new Cafe(orders);
        //System.out.println(Cafe.getTotalIncome());
        assertEquals(new BigDecimal(161.8).setScale(2, RoundingMode.HALF_UP), Cafe.getTotalIncome());

    }

    @Test
    public void getTotalIncomeForADay() {
        Cafe Cafe = new Cafe(orders);
        LocalDate localDate = LocalDate.of(2018, 5, 4);

        assertEquals(new BigDecimal(24.8).setScale(2, RoundingMode.HALF_UP), Cafe.getTotalIncome(localDate));
    }

    @Test
    public void getNumberOfCafe() {
        Cafe Cafe = new Cafe(orders);

        assertEquals(7L, Cafe.getNumberOfCoffee(CoffeeType.ESPRESSO));
    }

    @Test
    public void getOrdersAfter() {
        Cafe Cafe = new Cafe(orders);
        LocalDate localDate = LocalDate.of(2018, 5, 4);
        LocalTime localTime = LocalTime.of(10, 45);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);

        assertEquals(3, Cafe.getOrdersAfter(dateTime).size());
    }

    @Test
    public void getFirstFiveOrder() {
        Cafe Cafe = new Cafe(orders);
        LocalDate localDate = LocalDate.of(2018, 5, 3);
        LocalTime localTime = LocalTime.of(9, 19);

        List<CoffeeOrder> firstFiveOrder = Cafe.getFirstFiveOrder(localDate);

        assertEquals(5, firstFiveOrder.size());
        assertEquals(LocalDateTime.of(localDate, localTime), firstFiveOrder.get(0).getDateTime());
        assertEquals(2, firstFiveOrder.get(0).getCoffees().size());
    }
}
