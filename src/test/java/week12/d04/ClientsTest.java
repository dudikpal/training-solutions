package week12.d04;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientsTest {
    
    private static Map<String, Client> clientsMap;
    private static Clients clients;
    
    @BeforeAll
    static void createAndFillMap() {
        clientsMap = new HashMap<>();
        clientsMap.put("absg234", new Client("absg234", "Plazma Péter"));
        clientsMap.put("dbc758", new Client("dbc758", "Erős Márton"));
        clients = new Clients(clientsMap);
    }
    
    @Test
    void testFindByRegNumber() {
        assertEquals("Plazma Péter", clients.findByRegNumber("absg234"));
    }
    
    
    @Test
    void testFindByNamePart() {
        assertEquals(1, clients.findByNamePart("rto").size());
    }
    
}