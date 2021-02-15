package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {
  
  public String createHistogram(BufferedReader reader) throws IOException {
    String line;
    StringBuilder sb = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      for (int i = 0; i < Integer.parseInt(line); i++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
