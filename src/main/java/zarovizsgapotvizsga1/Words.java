package zarovizsgapotvizsga1;

public class Words {
    
    public boolean hasMoreDigits(String s) {
        int notDigit = s.length() - digitCounter(s);
        return notDigit < s.length() - notDigit;
    }
    
    private int digitCounter(String s) {
        int counter = 0;
        for (char letter : s.toCharArray()) {
            if (Character.isDigit(letter)) {
                counter++;
            }
        }
        return counter;
    }
}
