package zarovizsgapotvizsga2.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;
    
    public Fish(String name, int weight, String color, boolean memoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = memoryLoss;
    }
    
    public String status() {
        return name + ", weight: " + weight + ", color: " + color +
                   ", short term memory loss: " + memoryLoss;
    }
    
    public abstract void feed();
    
    public void setWeight(int weight) {
        this.weight += weight;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getColor() {
        return color;
    }
    
    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
