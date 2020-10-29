package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance();
        System.out.println(distance.getDistance());
        System.out.println(distance.isPrecize());

        int intDistance = (int) distance.getDistance();
        System.out.println(intDistance);
    }
}
