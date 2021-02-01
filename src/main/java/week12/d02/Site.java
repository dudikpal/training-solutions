package week12.d02;

public class Site implements Comparable<Site>{

    private boolean side;
    private int width;
    private char color;

    public Site(boolean side, int width, char color) {
        this.side = side;
        this.width = width;
        this.color = color;
    }

    public boolean isSide() {
        return side;
    }

    public int getWidth() {
        return width;
    }

    public char getColor() {
        return color;
    }

    @Override
    public int compareTo(Site o) {
        return this.width - o.width;
    }
}
