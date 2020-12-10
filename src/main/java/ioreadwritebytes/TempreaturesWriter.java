package ioreadwritebytes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TempreaturesWriter {

    public Temperatures writeTemperatures (Temperatures temp, String pathString) {
        try {
            Files.write(Path.of(pathString), temp.getData());
        } catch (IOException ex) {
            throw new IllegalStateException("File not found: " + pathString, ex);
        }
        return null;
    }

    /*  temperatures.dat létrehozása:

        public static void main (String[] args) throws IOException{

        byte[] data = new byte[365];
        new Random(5).nextBytes(data);
        System.out.println(Arrays.toString(data));

        TempreaturesWriter tw = new TempreaturesWriter();
        Temperatures temp = new Temperatures(data);
        tw.writeTemperatures(temp, "src/test/java/ioreadwritebytes/temperatures.dat");

    }*/
}
