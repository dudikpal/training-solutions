package interfaces.animal;

public class Duck implements Animal{

    private final int numberOfLegs = 2;
    private final String name = "Duck";

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
