package interfaceextends.robot;

public interface FlyableRobot extends MoveableRobot{

    long ALTITUDE = 5;
    void liftTo(long altitude);
}
