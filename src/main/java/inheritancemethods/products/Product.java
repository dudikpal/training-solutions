package inheritancemethods.products;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
        numberOfDecimals = 2;
    }

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this(name, unitWeight);
        this.numberOfDecimals = numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces) {
        return BigDecimal.valueOf(pieces).multiply(unitWeight);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    private void isObjectNull(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("The weight must not be null!");
        }
    }

    private void isNameNullOrEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("The name must not be null or empty!");
        }
    }

    private void isNumberOfDecimalsNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number of decimals must not be less than zero!");
        }
    }
}
