package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordCounter {

    private final String SEARCHED_STRING = "koronavírus";

    public int wordCounter(InputStream is){
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(SEARCHED_STRING)) {
                    counter++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
        return counter;
    }
}
