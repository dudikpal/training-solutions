package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LottoReader {

    private int[] number = new int[90];

    public LottoReader(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(";");
                for (int i = 11; i < 16; i++) {
                    number[Integer.parseInt(words[i]) - 1]++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, " + ioe);
        }
    }

    public int getNumber(int number) {
        return this.number[number - 1];
    }
}
