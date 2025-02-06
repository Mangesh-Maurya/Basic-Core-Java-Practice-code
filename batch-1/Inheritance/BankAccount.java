package com.java.oops.encapsulation;

public class BankAccount {

	private String name;
	private String address;
	private String accNo;
	private String balance="0";
	private float withdrawlAmt;
	private float depAmt;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Mr. "+name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public long getBalance() {
		return (long)Float.parseFloat(balance);
	}
	
	public void amtDeposit(float amount) {
		depAmt=amount;
		amount=Float.valueOf(this.balance) + amount;
		this.balance= String.valueOf(amount);
	}

	public float getDepAmt() {
		return depAmt;
	}
	
	
	public float withdrawl(float amount) {
		if(Float.valueOf(this.balance) < amount) {
			System.out.println("Insufficient Balance.");
			return 0;
		}else {
			float withAmt = Float.parseFloat(balance) - amount;
			//balance = 600, amount=500 => 600-500=100
			this.balance = String.valueOf(withAmt);
		}
		withdrawlAmt=amount;
		return amount;
		
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", withdrawlAmt= "+withdrawlAmt+", address=" + address + ", accNo=" + accNo + ", balance=" + balance + "]";
	}

	
	

}
