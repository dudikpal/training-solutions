package statements;

public class Investment {
    private double cost;
    private int fund, interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.active = true;
        this.fund = fund;
        this.interestRate = interestRate;
        this.cost = 0.003;
    }

    public double getCost() {
        return this.cost;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getYield(int days) {
        return getFund() * getInterestRate() * days / 100 / 365 ;
    }

    public double close(int days) {
        if (isActive()) {
            setActive(false);
            return getFund() + getYield(days) - (getFund() + getYield(days)) * getCost();
        } else {
            return 0;
        }
    }
}
