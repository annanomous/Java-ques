package Qn4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class adTest {
@Test 

	public void  add(){
	Calculator a1 =new Calculator();
	int result = a1.add(5, 5);
	assertEquals(10, result , " error aayo");
	
}
}
