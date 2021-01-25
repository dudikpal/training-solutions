package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Cities {

    private List<City> cities = new ArrayList<>();
    private final String file = "/cities.txt";

    public City firstCity(String file) {
        InputStream is = this.getClass().getResourceAsStream(file);
        fileRead(new BufferedReader(new InputStreamReader(is)));
        Collections.sort(cities, Comparator.comparing(City::getName));
        return cities.get(0);
    }

    private void fileRead(BufferedReader br) {
        try {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] words = line.split(";");
                String Irsz = words[0];
                String cityName = words[1];
                String citySubname = null;
                if (words.length > 2) {
                    citySubname = words[2];
                }
                cities.add(new City(Irsz, cityName, citySubname));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }
}
