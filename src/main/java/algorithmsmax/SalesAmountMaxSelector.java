package algorithmsmax;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson salespersonWithMaxAmount = null;
        for (Salesperson item: salespersons) {
            if (salespersonWithMaxAmount == null || item.getAmount() > salespersonWithMaxAmount.getAmount()) {
                salespersonWithMaxAmount = item;
            }
        }
        return salespersonWithMaxAmount;
    }
}
