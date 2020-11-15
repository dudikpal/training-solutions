package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson salespersonWithFurthestAbove = null;
        for (Salesperson item: salespersons) {
            if (salespersonWithFurthestAbove == null || (item.getDifferenceFromTarget() > 0 && item.getDifferenceFromTarget() > salespersonWithFurthestAbove.getDifferenceFromTarget())) {
                salespersonWithFurthestAbove = item;
            }
        }
        return salespersonWithFurthestAbove;
    }

}
