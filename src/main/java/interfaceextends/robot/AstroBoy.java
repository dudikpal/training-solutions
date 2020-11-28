package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    private long altitude = ALTITUDE;

    public long getAltitude() {
        return altitude;
    }

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void walkTo(Point position) {
        path.add(position);
        this.position = position;
    }

    public void moveTo(Point position) {
        walkTo(position);
    } // delegálja a funkciót

    public void liftTo(long altitude) {
        position = new Point(position.getX(), position.getY(), altitude);
        this.altitude = position.getZ();
        path.add(position);
    }

    public void flyTo(Point position) {
        path.add(position);
        this.position = position;
    }

    public void fastMoveTo(Point position) {
        liftTo(altitude);
        position = new Point(position.getX(), position.getY(), altitude);
        flyTo(position);
        liftTo(0);
    } //komplex mozgás, felemelkedik, elrepül a célpont fölé, és leereszkedik

    public void rotate(int angle) {
        this.angle = angle;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
