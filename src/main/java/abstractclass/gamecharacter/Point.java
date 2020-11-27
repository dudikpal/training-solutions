package abstractclass.gamecharacter;

public class Point {
    
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point point) {
        long aSideLength = Math.abs(x - point.getX());
        long bSideLength = Math.abs(y - point.getY());
        return (long)Math.sqrt(Math.pow(aSideLength, 2) + Math.pow(bSideLength, 2));
    }
    
    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
