package com.java.oops.encapsulation;
	
public class BankTest {
	//encapsulated
	//tightly encapsulated
	public static void main(String[] args) {
		BankAccount ba =new BankAccount();
//		ba.balance=123.23f;
		System.out.println("total balance before: "+ba.getBalance());
		ba.setAccNo("1231234556545");
		ba.amtDeposit(20000);
		ba.setAddress("muradnagar");
		ba.setName("123rachit");
		
		System.out.println("deposited amount: "+ba.getDepAmt());
		System.out.println("total balance after deposit: "+ba.getBalance());
		ba.withdrawl(10000);
		System.out.println("total balance after withdrawl: "+ba.getBalance());
		
		System.out.println(ba);
		
		
		
	}
}
