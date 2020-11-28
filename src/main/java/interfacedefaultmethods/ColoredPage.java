package interfacedefaultmethods;

public class ColoredPage {

    private String content;
    private String color;

    public ColoredPage(String content, String color) {
        this.content = content;
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }
}
