package com.java.oops.abstraction.abstracts;

public abstract class AbstractPaymentMethod {
	 String paymentId;
	private double amount;
	
	
	AbstractPaymentMethod(String paymentId, double amount) {
		this.paymentId = paymentId;
		this.amount = amount;
	}



	public abstract String doPayment();
	
	
}
