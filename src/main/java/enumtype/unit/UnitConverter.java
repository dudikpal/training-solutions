package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) {

        BigDecimal multiple = length.multiply(new BigDecimal(source.getInMillimeter())).divide(new BigDecimal(target.getInMillimeter()), 4, RoundingMode.HALF_UP);

        return multiple;
    }

    public List<LengthUnit> siUnits() {
        List<LengthUnit> result = new ArrayList<>();
        for (LengthUnit unit: LengthUnit.values()) {
            if (unit.isSiUnit()) {
                result.add(unit);
            }
        }
        return result;
    }
}
