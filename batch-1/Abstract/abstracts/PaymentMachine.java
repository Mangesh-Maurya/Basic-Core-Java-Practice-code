package com.java.oops.abstraction.abstracts;

public class PaymentMachine {
	//0 to 100%
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentMachine pm = new PaymentMachine();
//		CreditCardMethod ccm = new CreditCardMethod("98789878", 1000, "3454334", "13/12/2025");
		BankTransferMethod btm = new BankTransferMethod("3453", 2000, "989898989", "pnb00001232");
		pm.insertMethod(btm);
		
	}
	
	
	public void insertMethod(AbstractPaymentMethod apm) {
		System.out.println(apm.doPayment());
		
	}
	
}
