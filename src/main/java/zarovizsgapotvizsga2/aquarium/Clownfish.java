package zarovizsgapotvizsga2.aquarium;

public class Clownfish extends Fish{
    
    
    public Clownfish(String name, int weight, String color) {
        super(name, weight, color, false);
    }
    
    @Override
    public void feed() {
        setWeight(1);
    }
}
