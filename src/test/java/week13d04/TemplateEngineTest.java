package week13d04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
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
    BufferedReader br = new BufferedReader(sr);
    StringWriter sw = new StringWriter();
    BufferedWriter bw = new BufferedWriter(sw);
    
    new TemplateEngine().merge(br, map, bw);
    
    System.out.println(br.toString());
    System.out.println(sr.toString());
    System.out.println(bw.toString());
    System.out.println(sw.toString());
    
    
    assertEquals("Kedves {nev}!\n" +
                     "Megküldjük önnek a következő esedékes számláját {datum} dátummal,\n" +
                     "melynek összege: {osszeg} Ft!\n" +
                     "A fizetési határidő {hatarido}.\n" +
                     "Üdvözlettel,\n" +
                     "Ügyfélszolgálat", sw.toString());
  }
}