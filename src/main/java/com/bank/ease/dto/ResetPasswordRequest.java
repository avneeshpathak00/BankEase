package com.bank.ease.dto;

public record ResetPasswordRequest(String identifier, String resetToken, String newPassword) {
}