package week12.d01;

import org.junit.jupiter.api.Test;
import week12.d01.GoodsPacker;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void packGoods() {
        GoodsPacker goodsPacker = new GoodsPacker();

        int[][] goods = {{5, 10}, {10, 10}, {10, 20}};
        int capacity = 49;

        assertEquals(90, goodsPacker.packGoods(goods, capacity));
    }
}