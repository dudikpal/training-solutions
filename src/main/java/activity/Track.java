package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void loadFromGpx(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))){
            String line;
            Coordinate coordinate = null;
            TrackPoint trackPoint = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    String[] words = line.split("=\"");
                    double latitude = Double.parseDouble(words[1].substring(0, words[1].indexOf(".") + 8));
                    double longitude = Double.parseDouble(words[2].substring(0, words[2].indexOf(".") + 8));
                    coordinate = new Coordinate(latitude, longitude);
                }
                if (line.trim().startsWith("<ele")) {
                    double elevation = Double.parseDouble(line.substring(line.indexOf("<ele>") + 5, line.indexOf("</ele>")));
                    trackPoint = new TrackPoint(coordinate, elevation);
                    trackPoints.add(trackPoint);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, " + ioe);
        }
    }

    public double getRectangleArea() {
        double minX = findMinimumCoordinate().getLatitude();
        double minY = findMinimumCoordinate().getLongitude();
        double maxX = findMaximumCoordinate().getLatitude();
        double maxY = findMaximumCoordinate().getLongitude();
        return (maxX - minX) * (maxY - minY);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLongitude = 0;
        double maxLatitude = 0;
        for (TrackPoint trackPoint: trackPoints) {
            if (maxLatitude < trackPoint.getCoordinate().getLatitude()) {
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (maxLongitude < trackPoint.getCoordinate().getLongitude()) {
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLongitude = 0;
        double minLatitude = 0;
        for (TrackPoint trackPoint: trackPoints) {
            if (minLatitude > trackPoint.getCoordinate().getLatitude()) {
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (minLongitude > trackPoint.getCoordinate().getLongitude()) {
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance() {
        double distance = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));
        }
        return distance;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullDecrease() {
        TrackPoint trackPointBefore = trackPoints.get(0);
        double fullElevation = 0;
        for (TrackPoint trackPoint: trackPoints) {
            double heightDifference = trackPointBefore.getElevation() - trackPoint.getElevation();
            if (heightDifference > 0) {
                fullElevation += heightDifference;
            }
            trackPointBefore = trackPoint;
        }
        return fullElevation;
    }

    public double getFullElevation() {
        TrackPoint trackPointBefore = trackPoints.get(0);
        double fullElevation = 0;
        for (TrackPoint trackPoint: trackPoints) {
            double heightDifference = trackPointBefore.getElevation() - trackPoint.getElevation();
            if (heightDifference < 0) {
                fullElevation += heightDifference;
            }
            trackPointBefore = trackPoint;
        }
        return Math.abs(fullElevation);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }
}
