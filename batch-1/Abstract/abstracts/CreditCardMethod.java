package com.java.oops.abstraction.abstracts;

public class CreditCardMethod extends AbstractPaymentMethod{

	String cardNo;
	String expiry;
	
	
	
	
	public CreditCardMethod(String paymentId, double amount, String cardNo, String expiry) {
		super(paymentId, amount);
		this.cardNo = cardNo;
		this.expiry = expiry;
	}




	@Override
	public String doPayment() {
		System.out.println("check valid card no");
		System.out.println("amount check");
		System.out.println("payment processing");
		return "payment processed successfully by credit method";
	}




	public String getCardNo() {
		return cardNo;
	}




	public String getExpiry() {
		return expiry;
	}
	
	
	
	
}
