package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    private List<byte[]> myMatrix = new ArrayList<>();
    private String path = "src/main/java/ioreadbytes/bytematrix/matrix.dat";

    /*public static void main(String[] args) {
        MatrixReader mr = new MatrixReader();
        mr.readBytesAndCreateMatrix("src/main/java/ioreadbytes/bytematrix/matrix.dat");
        System.out.println(mr.numberOfColumnsWhereMoreZeros());
    }*/

    public int numberOfColumnsWhereMoreZeros() {
        int zeroColumns = 0;
        for (int i = 0; i < myMatrix.get(0).length; i++) {
            int zeros = 0;
            for (int j = 0; j < myMatrix.size(); j++) {
                if (myMatrix.get(j)[i] == 0) {
                    zeros++;
                }
            }
            if (zeros == myMatrix.size()) {
                zeroColumns++;
            }
        }

        return zeroColumns;
    }

    public void readBytesAndCreateMatrix(String pathString) {
        try (BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(Path.of(pathString)))){
            byte[] bites = bis.readAllBytes();
            int index = 0;
            while (index < bites.length) {
                byte[] temp = new byte[1000];
                for (int i = 0; i < 1000; i++) {
                    temp[i] = bites[i];
                    index++;
                }
                myMatrix.add(temp);
            }

        } catch (IOException ex) {
            throw new IllegalStateException("Cant read the file");
        }
        createMatrix(pathString);
    }

    public void createMatrix(String pathString) {
        Path path = Path.of(pathString);
        try {
            //Files.createDirectories(path);
            OutputStream writer = new BufferedOutputStream(Files.newOutputStream(path));
            for (int i = 0; i < 8974; ++i) {
                if (i % 1000 < 493) {
                    writer.write((int) 0);
                } else {
                    writer.write((int) 1);
                }
            }
            writer.flush();
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't write matrix file!");
        }
    }

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(myMatrix);
    }

    //eredeti!!!
    /*public void createMatrix(String pathString) {
        Path path = Path.of("src/main/resources/bytematrix");
        try {
            Files.createDirectories(path);
            OutputStream writer = new BufferedOutputStream(Files.newOutputStream(path.resolve(pathString)));
            for (int i = 0; i < 8974; ++i) {
                if (i % 1000 < 493) {
                    writer.write((int) (1.05 * Math.random()));
                } else {
                    writer.write((int) (1.05 * Math.random()+.95));
                }
            }
            writer.flush();
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't write matrix file!");
        }
    }*/
}
