package ioconvert.products;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Product> products) {
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(os))){
            for (Product item: products) {
                ps.print(item.getName());
                ps.print(";");
                ps.println(item.getPrice());
            }
        }
    }
}
