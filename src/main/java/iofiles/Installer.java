package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Installer {

    public void install(String pathString) {
        Path path = Path.of(pathString);
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            throw new IllegalArgumentException("The given directory doesn't exist");
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Installer.class.getResourceAsStream("/install/install.txt")))){
            String line;
            String sourceDirectory = "/install/";
            System.out.println("Source: " + sourceDirectory);
            while ((line = br.readLine()) != null) {
                if (line.endsWith("/")) {
                    Files.createDirectory(path.resolve(line));
                    System.out.println("Endswith /: " + line);
                } else {
                    System.out.println("else: line: " + line + "Source+resolve(line): " + Path.of(sourceDirectory).resolve(line).toString());
                    Files.copy(this.getClass().getResourceAsStream(sourceDirectory), path.resolve(line));
                }
            }

        } catch (IOException ioe) {

        }
    }


}
