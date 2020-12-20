package ioconvert.shopping;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(os))){
            for (String item: shoppingList) {
                ps.println(item);
            }
        }/*catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file, ", ioe);
        }*/
    }

    public List<String> loadShoppingList(InputStream is) {
        try (BufferedReader bis = new BufferedReader(new InputStreamReader(is))){
            List<String> shoppingList = new ArrayList<>();
            String line;
            while ((line = bis.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file, ", ioe);
        }
    }
}
