package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String empty = "" + "";
        System.out.println(empty.length());
        String str = "Abcde";
        System.out.println(str.length());
        System.out.println(str.substring(0, 1) + ", " + str.substring(2, 3));
        System.out.println(str.substring(0, 3));
    }
}
