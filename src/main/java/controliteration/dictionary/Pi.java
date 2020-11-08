package controliteration.dictionary;

public class Pi {


    public static void main(String[] args) {

        String source = "Nem a régi s durva közelítés, mi szótól szóig így kijön betűiket számlálva. Ludolph eredménye már, ha itt végezzük húsz jegyen. De rendre kijő még tíz pontosan, Azt is bízvást ígérhetem.";

        String expected = "3.141592653589793238462643383279";
        int counter = 0;
        String Pi = "";

        for (int i = 0; i < source.length(); i++) {
            if (Character.isLetter(source.charAt(i))) {
                counter++;
            } else if (counter != 0){
                Pi += counter;
                counter = 0;
            }

            if ( Pi.length() == 1) {
                Pi += '.';
            }
        }

        System.out.println("Kiszámolt érték: ");
        System.out.println(Pi);
        System.out.println("Elvárt érték: ");
        System.out.println(expected);
    }
}
