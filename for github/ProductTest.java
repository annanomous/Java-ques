package Qn4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ProductTest {
@Test

public void testProduct() {
	product product =new product("Laptop " , 500.0  ,1);
	assertAll("product", 
			() -> assertNotNull(product.name),
			() ->assertTrue(product.price >0),
			() ->assertTrue(product.isAffordable(600.0)),
			() ->assertFalse(product.isAffordable(400.0))
			);
}
} 
