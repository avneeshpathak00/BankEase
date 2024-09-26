package com.bank.ease.exception;

public class AccountDoesNotExistException extends RuntimeException {

	public AccountDoesNotExistException(String message) {
		super(message);
	}
}
