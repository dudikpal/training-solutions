package immutable;

public class Satellite {

    private CelestialCoordinates coords;
    private String registerIdent;

    public Satellite(CelestialCoordinates coords, String registerIdent) {
        isEmpty(registerIdent);
        this.coords = coords;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        coords = new CelestialCoordinates(coords.getX() + diff.getX(), coords.getY() + diff.getY(), coords.getZ() + diff.getZ());
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        return false;
    }

    public String toString() {
        return registerIdent + ": " + coords.toString();
    }

    public CelestialCoordinates getCoords() {
        return coords;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

}
