package week14.d02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    
    private String customerId;
    private Map<String, List<Product>> orders = new HashMap<>();
    
    public Customer(String customerId) {
        this.customerId = customerId;
    }
    
    
    public void addOrder(String orderId, List<Product> products) {
        orders.put(orderId, products);
    }
    
    
    public List<Product> getOrder(String orderId) {
        return new ArrayList<>(orders.get(orderId));
    }
    
    
    public static void main(String[] args) {
        Customer customer = new Customer("idaho");
        
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public Map<String, List<Product>> getOrders() {
        return orders;
    }
}
