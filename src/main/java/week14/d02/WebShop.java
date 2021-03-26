package week14.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class WebShop {
    
    private static final String CUSTOMER_ID_SEPARATOR = "-";
    private static final String ORDER_ID_SEPARATOR = ":\\s+";
    private static final String PRODUCT_SEPARATOR = "\\(|\\),?";
    private List<Customer> customers = new ArrayList<>();
    
    
    public Map<String, Integer> createStatisticByProduct() {
        Map<String, Integer> productsCount = new HashMap<>();
        for (Customer customer : customers) {
            for (List<Product> productList : customer.getOrders().values()) {
                for (Product product : productList) {
                    productsCount.merge(product.getName(), 1, Integer::sum);
                }
            }
        }
        return productsCount;
    }
    
    
    public int getProductSumPcs(String productName) {
        int counter = 0;
        for (Customer customer : customers) {
            for (List<Product> productList : customer.getOrders().values()) {
                for (Product product : productList) {
                    if (product.getName().equals(productName)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    
    
    public String sortedItemsInOrder(String orderId) {
        List<Product> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getOrders().containsKey(orderId)) {
                result = customer.getOrders().get(orderId);
                //Collections.sort(result, Comparator.comparing(Product::getName));
                result.sort(Comparator.comparing(Product::getName));
            }
        }
        return result.toString();
    }
    
    
    public int customerSumSpending(String customerId) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId().equals(customerId)) {
                index = i;
                break;
            }
        }
        int sumSpending = 0;
        for (List<Product> products : customers.get(index).getOrders().values()) {
            sumSpending += products.stream()
                .map(Product::getPrice)
                .reduce(0, (a, b) -> a + b);
        }
        /*return customers.get(index)
            .getOrders()
            .values()
            .toString();*/
        return sumSpending;
    }
    
    
    public int sumPriceOfOrder(String orderId) {
        for (Customer customer : customers) {
            if (customer.getOrders().containsKey(orderId)) {
                return customer.getOrders().get(orderId).stream()
                    .map(Product::getPrice)
                    .reduce(0, (a, b) -> a + b);
            }
        }
        return 0;
    }
    
    
    private void fillCustomers(String line) {
        String[] parts = line.split(CUSTOMER_ID_SEPARATOR + "|" + ORDER_ID_SEPARATOR + "|" + PRODUCT_SEPARATOR);
        List<Product> products = fillProducts(parts);
        String customerId = parts[0];
        String orderId = parts[1];
        int index = customerIndexFindById(customerId);
        createOrGetCustomer(products, customerId, orderId, index);
    }
    
    private void createOrGetCustomer(List<Product> products, String customerId, String orderId, int index) {
        if (index == -1) {
            Customer customer = new Customer(customerId);
            customers.add(customer);
            customer.addOrder(orderId, products);
        } else {
            customers.get(index).addOrder(orderId, products);
        }
    }
    
    private List<Product> fillProducts(String[] parts) {
        List<Product> products = new ArrayList<>();
        for (int i = 2; i < parts.length - 1; i += 2) {
            products.add(new Product(parts[i], Integer.parseInt(parts[i + 1])));
        }
        return products;
    }
    
    
    private int customerIndexFindById(String customerId) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId().equals(customerId)) {
                return i;
            }
        }
        return -1;
    }
    
    
    public void readFile() {
        InputStream is = this.getClass().getResourceAsStream("orders.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while ((line = br.readLine()) != null) {
                fillCustomers(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    
    public WebShop() {
        readFile();
    }
}
