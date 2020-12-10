package ioreadwritebytes;

import java.util.Arrays;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte temp: data) {
            sum += temp;
        }
        return sum / 365;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (int i = 30; i > 0; i--) {
            sum += data[data.length - i];
        }
        return sum / 30;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatures that = (Temperatures) o;
        return Arrays.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getData());
    }
}
