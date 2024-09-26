package com.bank.ease.dto;

public record PinRequest(String accountNumber, String pin, String password) {
}