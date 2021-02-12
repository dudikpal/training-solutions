package week15.d04;

import week15.d05.Country;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReader {
  
  public List<Country> reader(BufferedReader reader) {
    Map<String, Country> result = new HashMap<>();
    String line;
    try {
      line = reader.readLine();
      while ((line = reader.readLine()) != null) {
        
        if (line.contains("Bonaire, Saint Eustatius and Saba")) {
          line = line.replace("Bonaire, Saint Eustatius and Saba", "Bonaire Saint Eustatius and Saba");
        }
        
        String[] words = line.split(",");
        if (!words[7].isBlank()) {
          String name = words[4];
          int casesWeekly = Integer.parseInt(words[2]);
          int population = Integer.parseInt(words[7]);
          if (result.get(name) == null) {
            result.put(name, new Country(name, population, casesWeekly));
          } else {
            result.get(name).addCases(casesWeekly);
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new ArrayList<>(result.values());
  }
}
