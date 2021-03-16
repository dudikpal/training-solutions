package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {
    
    @Test
    void increasePrice() {
        
        DeveloperSoftware ds = new DeveloperSoftware("namedev", 200);
        ds.increasePrice(1.1);
        
        assertEquals(220, (int)ds.getPrice());
    }
}