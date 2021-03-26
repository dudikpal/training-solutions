package zarovizsgapotvizsga2.aquarium;

public class Tang extends Fish{
    
    public Tang(String name, int weight, String color) {
        super(name, weight, color, true);
    }
    
    @Override
    public void feed() {
        setWeight(1);
    }
}
