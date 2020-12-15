package week08.d02;

public class Country {

    private String name;
    private int population;
    private int numberOfFlagcolors;
    private int neighbourCountries;

    public Country(String name, int population, int numberOfFlagcolors, int neighbourCountries) {
        this.name = name;
        this.population = population;
        this.numberOfFlagcolors = numberOfFlagcolors;
        this.neighbourCountries = neighbourCountries;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumberOfFlagcolors() {
        return numberOfFlagcolors;
    }

    public int getNeighbourCountries() {
        return neighbourCountries;
    }
}
