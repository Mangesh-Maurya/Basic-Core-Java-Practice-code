package com.java.batch.exception;

public class UserException extends RuntimeException implements BaseResponse{
	//Runtimeexception is equvalent to unchecked exception
	//IoException is equivalent to checked exception
	
	private String resultMsg;
	private String status;
	
	public UserException(String msg, String status) {
		super(msg);
		resultMsg=msg;
		this.status=status;
	}
	
	public UserException(String msg, Throwable e) {
		super(msg, e);
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public String getMsg() {
		return resultMsg;
	}

	
}
