package activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = isValidValues(-90, 90, latitude);
        this.longitude = isValidValues(-180, 180, longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private double isValidValues(double min, double max, double actualValue) {
        if (max <= actualValue || min >= actualValue) {
            throw new IllegalArgumentException("The latitude between -90 and 90, and longitude between -180 and 180");
        }
        return actualValue;
    }
}
