package week13.d01;

public class City{

    private String Irsz;
    private String name;
    private String subName;

    public City(String irsz, String name, String subName) {
        Irsz = irsz;
        this.name = name;
        this.subName = subName;
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
