package typeconversion.dataloss;

public class DataLoss {

    public static void dataLoss() {
        int counter = 0;

        for (long i = 0; i < Long.MAX_VALUE; i++) {
            long convertedNumber = ((long)((float) i));
            if (i != convertedNumber) {
                System.out.println("Dec: " + i + ", Bin: " + Long.toBinaryString(i));
                System.out.println("Dec: " + convertedNumber + ", Bin: " + Long.toBinaryString(convertedNumber));
                counter++;
                if (counter == 3) {
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        dataLoss();
    }
}
