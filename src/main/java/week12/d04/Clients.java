package week12.d04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clients {
    
    private Map<String, Client> clients = new HashMap<>();
    
    public Clients(Map<String, Client> clients) {
        this.clients = clients;
    }
    
    public String findByRegNumber(String regNumber) {
        if (clients.get(regNumber) == null) {
            throw new IllegalArgumentException("Not find");
        }
        return clients.get(regNumber).getName();
    }
    
    public List<Client> findByNamePart(String namePart) {
        List<Client> result = new ArrayList<>();
        for (Client client : clients.values()) {
            if (client.getName().contains(namePart)) {
                result.add(client);
            }
        }
        return result;
    }
}
