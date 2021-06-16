package com.wisterdy.reimbursement2.Exceptions;
@SuppressWarnings("serial")
public class InvalidParam extends Exception {

	public InvalidParam() {
		
	}

	public InvalidParam(String message) {
		super(message);
	}

	public InvalidParam(Throwable cause) {
		super(cause);
		
	}

	public InvalidParam(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidParam(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
