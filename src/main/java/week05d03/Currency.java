package week05d03;

public enum Currency {

    HUF(300),
    USD(1);

    private long rate;

    Currency(long rate) {
        this.rate = rate;
    }

    public long getRate() {
        return rate;
    }
}
