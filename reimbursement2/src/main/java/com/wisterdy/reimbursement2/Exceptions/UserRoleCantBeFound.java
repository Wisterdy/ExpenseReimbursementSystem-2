package com.wisterdy.reimbursement2.Exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
public class UserRoleCantBeFound extends Exception {

	public UserRoleCantBeFound() {
		
	}

	public UserRoleCantBeFound(String message) {
		super(message);
		
	}

	public UserRoleCantBeFound(Throwable cause) {
		super(cause);
	
	}

	public UserRoleCantBeFound(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UserRoleCantBeFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
