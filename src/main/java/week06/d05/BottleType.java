package week06.d05;

public enum BottleType {

    GLASS_BOTTLE(20),
    PET_BOTTLE(10);

    private int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}
