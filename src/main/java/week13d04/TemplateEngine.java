package week13d04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TemplateEngine {
  
  public void merge(BufferedReader reader, Map<String, Object> map, BufferedWriter writer) {
    String line;
    try {
      while ((line = reader.readLine()) != null) {
        writer.write(lineProcessor(line, map));
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private String lineProcessor(String line, Map<String, Object> map) {
    int index = 0;
    while (line.indexOf('{', index) != -1) {
      int toIndex = line.indexOf('}');
      String placeholder = line.substring(line.indexOf('{') + 1, toIndex);
      line = line.replace("{" + placeholder + "}", map.get(placeholder).toString());
      index = toIndex;
    }
    return line;
  }
  
  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>(){{
      put("nev", "John Doe");
      put("datum", LocalDate.of(2018, 8, 8));
      put("osszeg", 10000.48);
      put("hatarido", LocalDate.of(2018, 8, 18).toString());
    }};
    
    InputStream is = TemplateEngine.class.getResourceAsStream("template.txt");
    
    Path path = Path.of("src/main/resources/week13d04/korlevel.txt");
    try (BufferedReader br = new BufferedReader(new InputStreamReader(is));
         BufferedWriter bw = new BufferedWriter(Files.newBufferedWriter(path))){
  
      new TemplateEngine().merge(br, map, bw);
      
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    
  }
}
