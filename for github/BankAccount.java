package Qn4;

public class BankAccount {
 private double balance;
 
 public BankAccount() {
	 this.balance=0.0;
 }
 
 public void deposite(double amount) {
	 if (amount >0) {
		 balance +=amount;
	 }
 }
 
 public boolean withdraw(double amount ) {
 if (amount >0 && amount <=balance) {
	 balance -=amount;
	 return true;
 }
 else {
 return false;
 }
 }
 public double getBalance() {
	 return balance;
 }
	 
}
