package com.java.oops.abstraction.interfaces;

public class PhonePePayment implements PaymentMethod{

	private String phoneNo;
	private String userOtp;
	private String otp ="12345";
	@Override
	public boolean validateUser() {
		//login 
		
		if(phoneNo.length() == 10) {
			//database 
			if(phoneNo.equals("1234567890")) {
				if(otp.equals(userOtp)) {
					return true;
				}
			}
			//validate user by phoneNo
		}
		return false;
	}

	
	
	
	public String getUserOtp() {
		return userOtp;
	}


	public void setUserOtp(String userOtp) {
		this.userOtp = userOtp;
	}


	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	

	
	
}
