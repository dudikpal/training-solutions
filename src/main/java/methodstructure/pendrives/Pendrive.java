package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return price < pendrive.price ? true : false;
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        double actualPricePerCapacity = (double)price / capacity;
        double comparePricePerCapacity = (double)pendrive.price / pendrive.capacity;
        int result = 0;
        if (actualPricePerCapacity > comparePricePerCapacity) {
            result = 1;
        } else if (actualPricePerCapacity < comparePricePerCapacity) {
            result = -1;
        }
        return result;
    }

    public void risePrice(int percent) {
        price += price * percent / 100;
    }

    public String toString() {
        return "Pendrive adatai:\n" +
                "Megnevezés: " + name +
                "\nKapacitás: " + capacity + "GB" +
                "\nÁr: " + price + " Ft.";
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
