package com.java.batch.oops.abstraction.payment;

public interface Bank {
	String processPayment(float amount);
}

class IciciBank implements Bank{

	float balance=500.00f;
	
	@Override
	public String processPayment(float amount) {
		if(amount < balance) {
			balance=balance-amount;
			System.out.println("Payment Successful for amount "+amount+" Rs.");
			return "success";
		}else {
			System.out.println("Insufficient Balance in Your Icici Account. Payment cannot be process.");
			return "fail";
		}
		
	}
	
}


class HdfcBank implements Bank{

	float balance=1000.00f;
	
	@Override
	public String processPayment(float amount) {
		if(amount < balance) {
			balance=balance-amount;
			System.out.println("Payment Successful for amount "+amount+" Rs.");
			return "success";
		}else {
			System.out.println("Insufficient Balance in Your Hdfc Account. Payment cannot be process.");
			return "fail";
		}
		
	}
	
}


class ShoppingCart{
	private Bank bank;
	
	ShoppingCart(Bank bank){
		this.bank=bank;
	}
	
	public void checkout(float amount) {
		String pay = bank.processPayment(amount);
		if(pay.equals("success")) {
			System.out.println("Payment successful. Enjoy you purchase!");
		}else {
			System.out.println("Payment failed.");
		}
	}
	
}

class Main{
	public static void main(String[] args) {
		IciciBank iciciBank = new IciciBank();
		ShoppingCart shoppingCart = new ShoppingCart(iciciBank);
		shoppingCart.checkout(500);
		
		HdfcBank hdfcBank = new HdfcBank();
		ShoppingCart hdfcshop = new ShoppingCart(hdfcBank);
		hdfcshop.checkout(500);
	}
}


