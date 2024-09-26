package com.bank.ease.dto;

public record AmountRequest(String accountNumber, String pin, double amount) {
	
}