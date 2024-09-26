package com.bank.ease.service;

import org.springframework.http.ResponseEntity;

import com.bank.ease.dto.OtpRequest;
import com.bank.ease.dto.OtpVerificationRequest;
import com.bank.ease.dto.ResetPasswordRequest;
import com.bank.ease.entity.User;

public interface AuthService {
	public String generatePasswordResetToken(User user);

	public boolean verifyPasswordResetToken(String token, User user);

	public void deletePasswordResetToken(String token);

	public ResponseEntity<String> sendOtpForPasswordReset(OtpRequest otpRequest);

	public ResponseEntity<String> verifyOtpAndIssueResetToken(OtpVerificationRequest otpVerificationRequest);

	public ResponseEntity<String> resetPassword(ResetPasswordRequest resetPasswordRequest);

}