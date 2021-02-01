package week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class Cities {

    private List<City> cities = new ArrayList<>();
    private final String file = "/cities.txt";

    public City firstCity(String file) {
        InputStream is = this.getClass().getResourceAsStream(file);
        fileRead(new BufferedReader(new InputStreamReader(is)));
        if (cities.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        Collections.sort(cities, Comparator.comparing(City::getName, Collator.getInstance(new Locale("hu", "HU"))));
        //az alábbi 2 is jó
        //cities.sort(new NameComparator());
        //cities.sort(Comparator.comparing(City::getName, Collator.getInstance(new Locale("hu", "HU"))));
        return cities.get(0);
    }

    private City processLine(String line) {
        String[] words = line.split(";");
        String Irsz = words[0];
        String cityName = words[1];
        String citySubname = null;
        if (words.length > 2) {
            citySubname = words[2];
        }
        return new City(Irsz, cityName, citySubname);
    }

    private void fileRead(BufferedReader br) {
        try {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                cities.add(processLine(line));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }
}
