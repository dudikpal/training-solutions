package week06.d05;

public class Bottle {

    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type) {
        this.type = type;
        //filledUntil = 0;
    }

    public static Bottle of(BottleType bottleType) {
        return new Bottle(bottleType);
    }

    public void fill(int fillAmount) {
        if (filledUntil + fillAmount > type.getMaximumAmount()) {
            throw new IllegalArgumentException("Overflow error!");
        }
        filledUntil += fillAmount;
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }
}
