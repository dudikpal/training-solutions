package week06d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart sc;

    @BeforeEach
    void fillItems() {
        sc = new ShoppingCart();

        sc.addItem("első", 3);
        sc.addItem("második", 4);
        sc.addItem("harmadik", 6);
        sc.addItem("második", 3);
    }

    @Test
    void testEmptyName() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> sc.addItem("", 4));

        assertEquals("The name must not be empty!", ex.getMessage());
    }

    @Test
    void testNameIsNull() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> sc.addItem(null, 4));

        assertEquals("The name must not be empty!", ex.getMessage());
    }

    @Test
    void testCreate() {

        assertEquals(3, sc.getItems().size());
    }

    @Test
    void testAddQuantityToSameItem() {

        assertEquals(7, sc.getItems().get(1).getQuantity());
    }

    @Test
    void testByName() {
        assertEquals(6, sc.getItem("harmadik"));
    }

}