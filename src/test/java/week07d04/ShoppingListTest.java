package week07d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    void testSum() {
        String pathString = "src/test/java/week07d04/resources/shoppingList.txt";

        ShoppingList sl = new ShoppingList();

        assertEquals(760, sl.calculateSum(pathString));
    }
}