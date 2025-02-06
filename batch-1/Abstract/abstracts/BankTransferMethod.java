package com.java.oops.abstraction.abstracts;

public class BankTransferMethod extends AbstractPaymentMethod{

	String accNo;
	String branchCode;
	

	public BankTransferMethod(String paymentId, double amount, String accNo, String branchCode) {
		super(paymentId, amount);
		this.accNo = accNo;
		this.branchCode = branchCode;
		
	}

	

	public String getAccNo() {
		return accNo;
	}



	public String getBranchCode() {
		return branchCode;
	}



	@Override
	public String doPayment() {
		System.out.println("bank transfer");
		System.out.println("amount check");
		System.out.println("payment processing");
		return "payment successfully sent by bank transfer";
	}

}
