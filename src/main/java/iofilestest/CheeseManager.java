package iofilestest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheeseManager {

    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            for (Cheese cheese: cheeses) {
                dos.writeUTF(cheese.getName());
                dos.writeDouble(cheese.getLactozAmount());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file, ", ioe);
        }
    }

    public Cheese findCheese(Path path, String searchedName) {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))){
            while(dis.available() > -1) {
                String name = dis.readUTF();
                double lactozAmount = dis.readDouble();
                if (name.equals(searchedName)) {
                    return new Cheese(name, lactozAmount);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: ", ioe);
        }
        return null;
    }
}
