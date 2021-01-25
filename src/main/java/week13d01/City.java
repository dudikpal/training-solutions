package week13d01;

import java.util.Comparator;

public class City implements Comparator<City> {

    private String Irsz;
    private String name;
    private String subName;

    public City(String irsz, String name, String subName) {
        Irsz = irsz;
        this.name = name;
        this.subName = subName;
    }

    @Override
    public int compare(City o1, City o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public String getIrsz() {
        return Irsz;
    }

    public String getName() {
        return name;
    }

    public String getSubName() {
        return subName;
    }

    @Override
    public String toString() {
        return Irsz + " " + name;
    }
}
