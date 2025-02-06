package com.java.oops.abstraction.interfaces;



public interface PaymentMethod {
	
	//using interface we can achieve 100% abstraction
	//all the instance variable will be static final by default
	//can have all abstract methods
	//non-abstract methods -> default, static
	
	double paymentProcessFee=10.0;
	
	public boolean validateUser();
	
	default String processPayment(User user) {
		boolean isValid = validateUser();
		if(isValid == true) {
			//connecting other system
			System.out.println(user);
			return "payment sent successfully";
		}else {
			return "Invalid User";
		}
//		double f = paymentProcessFee;
//		if()
		//return null;
	}
	
	
}
