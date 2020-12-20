package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ImageAssembler {

    /*public void makeImageFile(byte[][] imageParts, Path folder) {
        Path file = folder.resolve("image.png");
        try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (byte[] onePart : imageParts) {
                os.write(onePart);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }*/

    public void makeImageFile(byte[][] bytes, Path path) {
        Path file = path.resolve("image.png");
        try (BufferedOutputStream ops = new BufferedOutputStream(Files.newOutputStream(file))){
            for (byte[] byteArray: bytes) {
                    ops.write(byteArray);
                for (byte item: byteArray) {
                }
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Write error" + ex.getCause());
        }

    }
}
