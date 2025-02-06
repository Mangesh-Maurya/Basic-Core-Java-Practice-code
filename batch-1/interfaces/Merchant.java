package com.java.oops.abstraction.interfaces;

import java.util.Scanner;

public class Merchant {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Your Payment Method.");
//		
//		String name = scanner.next();
//		System.out.println("my name is: "+name);
//		int num = scanner.nextInt();
//		System.out.println("my number is: "+num);		
//		scanner.next();
//		sendPaymentByPhonePe(2344);	
		
//		while(scanner.hasNext()) {
//			String paymentMethod = scanner.next();
//			if(paymentMethod.equals("phonepe")) {
//				int amount = scanner.nextInt();
//				sendPaymentByPhonePe(amount);	
//			}else {
//				int amount = scanner.nextInt();
//				sendPaymentByGoogle(amount);
//			}
//		}
				
//		scanner.close();
		
	}
	
	public static void sendPaymentByGoogle(int amount) {
		GooglePayPayment googlePay = new GooglePayPayment();
		googlePay.setEmail("abc@gmail.com");
		
		User user1 = new User();
		user1.setAmount(amount);
		user1.setMethodName("google pay");
		user1.setUpiId("abc@ibl");
		user1.setUserName("mangesh");
		String status = googlePay.processPayment(user1);
		System.out.println(status);
	}
	
	
	public static void sendPaymentByPhonePe(int amount) {
		PhonePePayment phonePe = new PhonePePayment();
		phonePe.setPhoneNo("1234567890");
		phonePe.setUserOtp("12345");
		
		User user = new User();
		user.setAmount(amount);
		user.setMethodName("phonepe");
		user.setUpiId("abc@ybl");
		user.setUserName("rachit");
		
		String status = phonePe.processPayment(user);
		System.out.println(status);
	}
	

}
