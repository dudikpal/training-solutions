package enumtype.unit;

public enum LengthUnit {

    MILLIMETER(true, 1),
    DECIMETER(true, 100),
    METER(true, 1000),
    YARD(false, 914.4),
    FOOT(false, 304.8),
    INCH(false, 25.4);

    private final boolean siUnit;
    private final double inMillimeter;

    LengthUnit(boolean siUnit, double inMillimeter) {
        this.siUnit = siUnit;
        this.inMillimeter = inMillimeter;
    }

    public double getInMillimeter() {
        return inMillimeter;
    }

    public boolean isSiUnit() {
        return siUnit;
    }
}
