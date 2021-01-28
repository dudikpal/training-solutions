package week13d04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplateEngineTest {
  
  @TempDir
  public File folder;
  
  @Test
  void merge() {
    
    Map<String, Object> map = new HashMap<>(){{
      put("nev", "John Doe");
      put("datum", LocalDate.of(2018, 8, 8));
      put("osszeg", 10000);
      put("hatarido", LocalDate.of(2018, 8, 18).toString());
    }};
    
    String template= "Kedves {nev}!\n" +
                         "Megküldjük önnek a következő esedékes számláját {datum} dátummal,\n" +
                         "melynek összege: {osszeg} Ft!\n" +
                         "A fizetési határidő {hatarido}.\n" +
                         "Üdvözlettel,\n" +
                         "Ügyfélszolgálat";
        
    StringReader sr = new StringReader(template);
    StringWriter sw = new StringWriter();
    try (BufferedReader br = new BufferedReader(sr);
         BufferedWriter bw = new BufferedWriter(sw)){
         new TemplateEngine().merge(br, map, bw);
      
    } catch (IOException ioe) {
      throw new IllegalArgumentException();
    }
    
    assertEquals("Kedves John Doe!\r\n" +
                     "Megküldjük önnek a következő esedékes számláját 2018-08-08 dátummal,\r\n" +
                     "melynek összege: 10000 Ft!\r\n" +
                     "A fizetési határidő 2018-08-18.\r\n" +
                     "Üdvözlettel,\r\n" +
                     "Ügyfélszolgálat\r\n", sw.toString());
  }
}