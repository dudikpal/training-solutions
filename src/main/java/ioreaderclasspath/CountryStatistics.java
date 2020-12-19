package ioreaderclasspath;

import library.NullOrEmpty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public Country mostBorderCountries() {
        Country maxBorderCountry = countryList.get(0);
        int maxBorder = countryList.get(0).getBorderCountries();
        for (Country country: countryList) {
            if (country.getBorderCountries() > maxBorder) {
                maxBorder = country.getBorderCountries();
                maxBorderCountry = country;
            }
        }
        return maxBorderCountry;
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream(fileName)))){
            NullOrEmpty.objectIsNull(reader, "File not found!");
            String line;
            while ((line = reader.readLine()) != null) {
                countryList.add(addCountry(line.split(" ")));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("File cant read!", ex);
        }
    }

    private Country addCountry(String[] line) {
        NullOrEmpty.arrayIsEmpty(line, "The array is empty, or null!");
        String name = line[0];
        int neighbours = Integer.parseInt(line[1]);
        return new Country(name, neighbours);
    }
}
