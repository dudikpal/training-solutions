package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salesPersons) {
        int sumSales = 0;
        for (Salesperson item: salesPersons) {
            sumSales += item.getAmount();
        }
        return sumSales;
    }
}
