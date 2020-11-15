package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson salespersonWithFurthestBelow = null;
        for (Salesperson item: salespersons) {
            if (salespersonWithFurthestBelow == null || (item.getDifferenceFromTarget() < 0 && item.getDifferenceFromTarget() < salespersonWithFurthestBelow.getDifferenceFromTarget())) {
                salespersonWithFurthestBelow = item;
            }
        }
        return salespersonWithFurthestBelow;
    }
}
