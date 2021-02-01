package week10.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Travel {

    public static final int NUMBER_OF_STOPS = 30;
    public static final String LINE_SEPARATOR = " ";

    public int getStopWithMax(InputStream is) {
        int[] counter = new int[NUMBER_OF_STOPS];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = reader.readLine()) != null) {
                counter[Integer.parseInt(line.split(LINE_SEPARATOR)[0])]++;
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
        int station = 0, maxPassenger = 0;
        for (int i = 0; i < counter.length; i++) {
            if (maxPassenger > counter[i]) {
                station = i;
            }
        }
        return station;
    }
}
