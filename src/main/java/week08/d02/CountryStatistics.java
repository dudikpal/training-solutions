package week08.d02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();
    private Path path;


    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public void readFromFile(String path) {
        this.path = Path.of(path);
        try {
            List<String> lines = Files.readAllLines(this.path);
            for (String line: lines) {
                String[] words = line.split(" ");
                countries.add(new Country(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]), Integer.parseInt(words[3])));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Cant read file", ex);
        }
    }

    public int maxPopulation() {
        int maxPopulation = 0;
        for (Country country: countries) {
            if (country.getPopulation() > maxPopulation) {
                maxPopulation = country.getPopulation();
            }
        }
        return maxPopulation;
    }
}
