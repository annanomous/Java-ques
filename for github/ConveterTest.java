package Qn4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConveterTest {
	@Test
	
	void testC2F(){
		TemperatureConverter t1 =new TemperatureConverter();
		double result =t1.C2F(0);
		assertEquals(32, result);		

	}
	
	void testF2C() {
		TemperatureConverter t2= new TemperatureConverter();
		double result2 =t2.F2C(0);
		assertEquals(-17.77,result2);
		
	}
}


