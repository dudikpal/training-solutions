package week14.d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TransformersTest {
    
    private List<Integer> input;
    
    @BeforeEach
    void setUp() {
        input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
    }
    
    
    @Test
    void testMap() {
        Transformers transformers = new Transformers();
        
        List<Integer> expected = List.of(2, 3, 4);
        //System.out.println(transformers.map(input, x -> x + 1));
        assertEquals(expected, transformers.map(input, x -> x + 1));
    }
    
    
    @Test
    void testReduce() {
        Transformers transformers = new Transformers();
        
        int expected = 6;
    
        assertEquals(expected, transformers.reduce(input, 0, Integer::sum));
    }
    
    
}