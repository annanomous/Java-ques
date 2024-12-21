package Qn4;

public class product {
	String name;
	double price;
	int quantity;
	
	public product(String name , double price , int quantity ) {
		this.name=name;
		this.price=price;
		this.quantity = quantity;
		
	}
	public boolean isAffordable(double budget) {
		return(price *quantity) <=budget;
	}

}


