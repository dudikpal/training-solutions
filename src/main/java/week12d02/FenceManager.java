package week12d02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FenceManager {

    private List<Site> sites = new ArrayList<>();

    public List<Site> getSites() {
        return new ArrayList<>(sites);
    }

    public void fileReader() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("kerites.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                boolean oddSide = words[0].equals("1");
                int width = Integer.parseInt(words[1]);
                char color = words[2].charAt(0);
                sites.add(new Site(oddSide, width, color));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }

    public List<Site> sortOfWidth() {
        List<Site> result = new ArrayList<>(sites);
        Collections.sort(result);
        return result;
    }

    public int lastSiteNumber() {
        Site lastHouse = sites.get(sites.size() - 1);
        boolean lastHouseSide = lastHouse.isSide();
        int counter;
        if (lastHouseSide) {
            counter = -1;
        } else {
            counter = 0;
        }
        for (Site site: sites) {
            if (site.isSide() == lastHouseSide) {
                counter+=2;
            }
        }
        return counter;
    }

    public void streetView() {
        StringBuilder sb = new StringBuilder();
        int counter = -1;
        for (Site site: sites) {
            if (site.isSide()) {
                counter+=2;
                sb.append("(" + counter + ")");
                for (int i = 0; i < site.getWidth() - 1; i++) {
                    sb.append(site.getColor());
                }
            }
        }
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Path.of("oddSideView.txt")))){
            pw.print(sb.toString());
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot write file, ", ioe);
        }
    }
}
