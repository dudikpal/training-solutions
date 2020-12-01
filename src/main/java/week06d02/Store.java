package week06d02;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<PiecesFromCategory> getProductsByCategory() {

        List<PiecesFromCategory> result = new ArrayList<>();
        for (Product product: products) {
            boolean newCategory = true;
            for (PiecesFromCategory resultItem: result) {
                if (resultItem.getCategory() == product.getCategory()) {
                    resultItem.increasePieces();
                    newCategory = false;
                }
            }
            if (newCategory) {
                result.add(new PiecesFromCategory(product.getCategory(), 1));
                newCategory = true;
            }
        }
        return result;
    }


    public String toStringOfResult() {
        String result = "";
        for (PiecesFromCategory item: getProductsByCategory()) {
            result += item.getCategory() + ": " + item.getPieces() + "\n";
        }
        return result;
    }


}
