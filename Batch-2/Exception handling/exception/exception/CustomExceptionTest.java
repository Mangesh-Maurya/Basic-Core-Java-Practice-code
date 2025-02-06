package com.java.batch.exception;

public class CustomExceptionTest {

	public static void main(String[] args) {
		//usrname password
		//submit
		//check if active or inactive
		//create session= timeout interval (5)
		//
		
		//throw -> used to throw the exception
		//throws -> used to catch the exception
		
		String username="ab";
//		
//		if(!username.equals("ab")) {
//			System.out.println("username is incorrect.");
//			throw new UserException("username is incorrect.");
//		}
		
		UserResult usr=null;
		
		try {
			verifyUser("ab");
			usr=new UserResult("User verified Successfully", "SUCCESS");
			System.out.println("database connection");
		} catch(UserException u) {
			System.out.println("user exception handled: "+u.getMessage());
			usr=new UserResult(u);
//			u.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("parent exception handled");
			e.printStackTrace();
		}finally {
			System.out.println("con closing");
		}
		
		System.out.println(usr);
	}
	
	
	public static void verifyUser(String name) throws UserException{
		if(!name.equals("ab")) {
			System.out.println("username is incorrect.");
			throw new UserException("username is incorrect.","Failed");
		}
		
		System.out.println("checking if active or inactive");
	}

}
