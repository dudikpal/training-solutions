package week06d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void testCreate() {
        List<Product> products = List.of(new Product("első", Category.FROZEN, 500),
                new Product("első", Category.FROZEN, 500),
                new Product("második", Category.BAKEDGOODS, 200),
                new Product("harmadik", Category.DAIRY, 5100),
                new Product("negyedik", Category.FROZEN, 100));

        Store store = new Store(products);

        assertEquals(1, store.getProductsByCategory().get(Category.BAKEDGOODS));
        assertEquals(1, store.getProductsByCategory().get(Category.DAIRY));
        assertEquals(3, store.getProductsByCategory().get(Category.FROZEN));
        assertEquals(null, store.getProductsByCategory().get(Category.OTHER));
    }

}