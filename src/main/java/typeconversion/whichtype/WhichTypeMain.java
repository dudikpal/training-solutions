package typeconversion.whichtype;

public class WhichTypeMain {

    public static void main(String[] args) {

        WhichType whichType = new WhichType();

        System.out.println(whichType.whichType(Long.toString(Long.MAX_VALUE - 4)));
        System.out.println(whichType.whichType(Long.toString(Integer.MAX_VALUE - 4)));
        System.out.println(whichType.whichType(Long.toString(Byte.MAX_VALUE - 1)));
        System.out.println(whichType.whichType(Long.toString((long)Byte.MAX_VALUE - 1)));
    }
}
