package com.bank.ease.exception;

public class OtpRetryLimitExceededException extends RuntimeException {

	public OtpRetryLimitExceededException(String message) {
		super(message);
	}
}
