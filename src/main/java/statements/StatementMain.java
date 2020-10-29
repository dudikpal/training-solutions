package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;
        System.out.println(z);
        boolean b = x > y ? true : false;
        boolean c = (b == true || z > 5) ? true : false;
        z += 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);
    }
}
