package com.java.batch.exception;

public class UserResult {
	
	private String msg;
	private String status;
	
	public UserResult(BaseResponse br) {
		msg=br.getMsg();
		status=br.getStatus();
	}
	
	public UserResult(String msg, String status ) {
		this.msg=msg;
		this.status=status;
	}

	@Override
	public String toString() {
		return "UserResult [msg=" + msg + ", status=" + status + "]";
	}
	
	
	
}
