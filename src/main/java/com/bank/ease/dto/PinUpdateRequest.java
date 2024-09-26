package com.bank.ease.dto;

public record PinUpdateRequest(String accountNumber, String oldPin, String newPin, String password) {
}