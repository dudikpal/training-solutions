package cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsedCars {

    public static void main(String[] args) {

        List<String> csvLines = new ArrayList<>();
        csvLines.add("AAA-333;2005;Audi;white");
        csvLines.add("BBB-222;1971;Koda;black");
        csvLines.add("CC-333;2000;Rabant;blue");
        csvLines.add("DDD-444;1970;Zapró;yellow");
        csvLines.add("EEE-555;2020;Breki;purple");
        csvLines.add("FFF666;1950;Cündapp;pearl");
        csvLines.add("2008;green");

        UsedCars usedCars = new UsedCars();
        //System.out.println(usedCars.toString());
        
        System.out.println(usedCars.filterLines(csvLines));

    }

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line: lines) {
            String[] parts = line.split(";");
            if(parts.length != 4 || !parts[0].contains("-") || parts[0].length() != 7 || Integer.parseInt(parts[1]) > 2019 || Integer.parseInt(parts[1]) < 1970) {
//Innen kezdve hiányzik jópár sor
            continue;
            }
            validLines.add(line);
        }
        return validLines;
    }

}
