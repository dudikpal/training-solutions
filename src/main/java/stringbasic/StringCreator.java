package stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        return new String("híp&púl");
    }

    public String createStrongForPool() {
        return "híp&púl";
    }
}
