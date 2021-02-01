package week05.d04;

public enum Currency {

    HUF(300),
    USD(300);

    private long rate;

    Currency(long rate) {
        this.rate = rate;
    }

    public long getRate() {
        return rate;
    }
}
