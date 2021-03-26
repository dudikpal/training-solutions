package zarovizsgapotvizsga2.aquarium;

public class Kong extends Fish{
    
    public Kong(String name, int weight, String color) {
        super(name, weight, color, false);
    }
    
    @Override
    public void feed() {
        setWeight(2);
    }
}
