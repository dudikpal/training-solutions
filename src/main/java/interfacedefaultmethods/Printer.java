package interfacedefaultmethods;

public class Printer {

    StringBuilder sb = new StringBuilder();

    public String print(Printable pages) {
        for (int i = 0; i < pages.getLength(); i++) {
            if (pages.getColor(i) != Printable.BLACK) {
                sb.append("[" + pages.getColor(i) + "]");
            }
            sb.append(pages.getPage(i) + "\n");
        }
        return sb.toString();
    }
}
