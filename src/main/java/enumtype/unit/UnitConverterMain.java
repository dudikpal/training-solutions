package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter uc = new UnitConverter();

        System.out.println(uc.convert(new BigDecimal(100), LengthUnit.DECIMETER, LengthUnit.FOOT));
        System.out.println(uc.convert(new BigDecimal(1000), LengthUnit.METER, LengthUnit.YARD));
        System.out.println(uc.convert(new BigDecimal(10), LengthUnit.MILLIMETER, LengthUnit.INCH));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(uc.siUnits());
    }
}
