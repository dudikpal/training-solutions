package iodatastream.statistics;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path path) {
        try (DataOutputStream outst = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            outst.writeInt(heights.size());
            for (int height: heights) {
                outst.writeInt(height);
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot write file, ", ex);
        }
    }
}
