package lambdacomparator.cloud;

public enum PayPeriod {
    MONTHLY(1),
    ANNUAL(12),
    LIFETIME(60);

    private int lenght;

    PayPeriod(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }
}
