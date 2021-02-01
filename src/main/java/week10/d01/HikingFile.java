package week10.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HikingFile {

    public Elevations getPlusElevation(InputStream is) {
        Elevations elevations = new Elevations();
        try (BufferedReader reader =new BufferedReader(new InputStreamReader(is))){
            String line;
            double beforeHeight = Double.parseDouble(reader.readLine().split(", ")[2]);
            while ((line = reader.readLine()) != null) {
                double actualHeight = Double.parseDouble(line.split(", ")[2]);
                double heightdiff = beforeHeight - actualHeight;
                if (heightdiff < 0) {
                    elevations.setLiftUp(Math.abs(heightdiff));
                } else {
                    elevations.setFallDown(heightdiff);
                }
                beforeHeight = actualHeight;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file, " + ioe);
        }
        return elevations;
    }
}
