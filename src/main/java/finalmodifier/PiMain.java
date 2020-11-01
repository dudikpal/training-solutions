package finalmodifier;



public class PiMain {
    public static void main(String[] args) {
        double r = 10, h = 15;
        System.out.println("Felhasznált értékek: r = " + r + ", h = " + h);
        CircleCalculator circle = new CircleCalculator();
        System.out.println(r + " sugarú kör kerülete: " + circle.calculatePerimeter(r) + ", területe: " + circle.calculateArea(r));
        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println(r + " sugarú, és " + h + " magasságú henger felülete: " + cylinder.calculateSurfaceArea(r, h) + ", térfogata: " + cylinder.calculateVolume(r, h));
        System.out.println("PI értéke: " + CircleCalculator.PI);
    }
}
