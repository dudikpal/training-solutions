package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {
    
    @Test
    void increasePrice() {
        
        OfficeSoftware os = new OfficeSoftware("name", 100);
        os.increasePrice(1.05);
        
        assertEquals(105, os.getPrice());
    }
}