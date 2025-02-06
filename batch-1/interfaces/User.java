package com.java.oops.abstraction.interfaces;

public class User {
	//bean, model, dto
	private String userName;//camelCase
	private String upiId;
	private double amount;
	private String email;
	private String methodName;
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", upiId=" + upiId + ", amount=" + amount + ", email=" + email
				+ ", methodName=" + methodName + "]";
	}
	
	
	
	
}
