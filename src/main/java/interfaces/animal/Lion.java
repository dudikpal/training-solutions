package interfaces.animal;

public class Lion implements Animal{

    private int numberOfLegs = 4;
    private String name = "Lion";

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
