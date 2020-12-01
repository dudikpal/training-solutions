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

    public Dictionary getProductsByCategory() {
        Hashtable piecesOfCategory = new Hashtable();
        for (Product product: products) {
            if (piecesOfCategory.containsKey(product.getCategory())) {
                int counter = Integer.parseInt(piecesOfCategory.get(product.getCategory()).toString()) + 1;
                piecesOfCategory.put(product.getCategory(), counter);
            } else {
                piecesOfCategory.put(product.getCategory(), 1);
            }
        }
        return piecesOfCategory;
    }


}
