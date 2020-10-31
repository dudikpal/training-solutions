package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] napok = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(napok[1]);
        System.out.println(napok.length);

        int [] number = new int [5];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int)Math.pow(2, i);
            System.out.println(number[i]);
        }

        boolean [] tf = new boolean [6];
        for (int i = 0; i < tf.length; i++) {
            tf[i] = i % 2 == 0 ? false : true;
            System.out.println(tf[i]);
        }
    }
}
