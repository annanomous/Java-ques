package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class BankAccountTest {
	@Test
	public void testDeposite() {
		System.out.println("testing deposite");
		BankAccount b1 = new BankAccount();
		b1.deposite(100.0);
		
		assertEquals(100.0,b1.getBalance());
	}
	@Test
	public void testWithdraw() {
		System.out.println("withdrawl tested");
		BankAccount b1 = new BankAccount();
		b1.deposite(100.0);
		
		boolean result = b1.withdraw(50.0);
		assertTrue(result);
	}
	
	@Test
	public void testWithdrawfails() {
		System.out.println(" failed ");
		BankAccount b1 = new BankAccount();
		b1.deposite(100.0);
		b1.withdraw(50.0);
		boolean result = b1.withdraw(60.0);
		assertFalse(result);
		assertEquals(50.0,b1.getBalance());
	}



}

