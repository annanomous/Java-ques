package Qn4;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> stock;

    public Inventory() {
        stock = new HashMap<>();
    }

    // Method to add products to the inventory
    public void addProduct(String productName, int quantity) {
        stock.put(productName, stock.getOrDefault(productName, 0) + quantity);
    }

    // Method to check if a product is available
    public boolean isProductAvailable(String productName, int quantity) {
        return stock.getOrDefault(productName, 0) >= quantity;
    }
}

