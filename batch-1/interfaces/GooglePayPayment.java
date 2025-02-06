package com.java.oops.abstraction.interfaces;

public class GooglePayPayment implements PaymentMethod{

	private String email;
	private String dbMail="abc@gmail.com";
	private boolean isUserBlocked=true;
	@Override
	public boolean validateUser() {
		//calling database to retrieve user;
		if(email.equals(dbMail)) {
			if(isUserBlocked != false) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
