package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    private Inventory inventory;

    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 25);
    }

    @Test
    public void testIsProductAvailable() {
        assertAll("inventory",
            () -> assertTrue(inventory.isProductAvailable("Laptop", 5), "Should return true if Laptop quantity is sufficient"),
            () -> assertFalse(inventory.isProductAvailable("Laptop", 15), "Should return false if Laptop quantity is insufficient"),
            () -> assertTrue(inventory.isProductAvailable("Mouse", 20), "Should return true if Mouse quantity is sufficient"),
            () -> assertFalse(inventory.isProductAvailable("Mouse", 30), "Should return false if Mouse quantity is insufficient"),
            () -> assertFalse(inventory.isProductAvailable("Keyboard", 1), "Should return false if Keyboard is not in stock")
        );
    }
}
