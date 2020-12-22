package iofilestest;

import library.NullOrEmpty;

import java.util.Objects;

public class Cheese {

    private final String name;
    private final double lactozAmount;

    public Cheese(String name, double lactozAmount) {
        NullOrEmpty.stringIsNullOrEmpty(name, "Name is empty or null!");
        NullOrEmpty.numberIsNegative(lactozAmount, "The number must be positive!");
        this.name = name;
        this.lactozAmount = lactozAmount;
    }

    public String getName() {
        return name;
    }

    public double getLactozAmount() {
        return lactozAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheese cheese = (Cheese) o;
        return Double.compare(cheese.getLactozAmount(), getLactozAmount()) == 0 &&
                Objects.equals(getName(), cheese.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLactozAmount());
    }
}
