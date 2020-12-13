package iowriter.music;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BandManager bm = new BandManager();
        bm.readBandsFromFile(Path.of("src/main/resources/iowriter/music/bands_and_years.txt"));
        System.out.println(Arrays.toString(bm.bands.toArray()));
        System.out.println(Paths.get(".").toRealPath());

        bm.writeBandsBefore(Path.of("src/main/resources/iowriter/music/result.txt"), 1999);
    }

    public void readBandsFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                bands.add(readLine(line));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Wrong file");
        }
    }

    private Band readLine(String line) {
        String[] words = line.split(";");
        return new Band(words[0], Integer.parseInt(words[1]));
    }

    public void writeBandsBefore(Path path, int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(path)){
            for (Band band: resultBands(year)) {
                bw.write(band.getName() + " " + band.getYear() + "\n");
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Wrong file");
        }
    }
    
    private List<Band> resultBands(int year) {
        List<Band> res = new ArrayList<>();
        for (Band band: bands) {
            if (band.getYear() < year) {
                res.add(band);
            }
        }
        return res;
    }

}
