package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position anotherPosition) {
        return Math.sqrt(Math.pow(posX - anotherPosition.getPosX(), 2) + Math.pow(posY - anotherPosition.getPosY(), 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
