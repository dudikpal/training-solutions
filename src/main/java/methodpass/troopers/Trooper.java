package methodpass.troopers;

public class Trooper {

    private Position position;
    private String name;

    public Trooper(String name) {
        isStringEmptyOrNull(name);
        this.name = name;
        position = new Position(0, 0);
    }

    public void changePosition(Position target) {
        isObjectNull(target);
        position = target;
    }

    public double distanceFrom(Position target) {
        isObjectNull(target);
        return position.distanceFrom(target);
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private void isStringEmptyOrNull(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
    }

    private void isObjectNull(Position pos) {
        if (pos == null) {
            throw new IllegalArgumentException("Position must not be null.");
        }
    }
}
