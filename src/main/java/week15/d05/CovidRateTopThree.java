package week15.d05;

import week15.d04.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class CovidRateTopThree {
  
  private List<Country> countries;
  
  public List<Country> topThree() {
    List<Country> result = new ArrayList<>();
    InputStream is = CovidRateTopThree.class.getResourceAsStream("/data.csv");
    
    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      countries = new FileReader().reader(br);
    } catch (IOException e) {
      e.printStackTrace();
    }
    Collections.sort(countries, Comparator.comparingDouble(Country::casesPopulationRate));
    Collections.reverse(countries);
    
    return countries.subList(0, 3);
  }
  
  public static void main(String[] args) {
      CovidRateTopThree covidRateTopThree = new CovidRateTopThree();
      System.out.println(covidRateTopThree.topThree());
  }
}
