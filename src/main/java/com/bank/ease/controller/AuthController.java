package com.bank.ease.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bank.ease.dto.OtpRequest;
import com.bank.ease.dto.OtpVerificationRequest;
import com.bank.ease.dto.ResetPasswordRequest;
import com.bank.ease.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService authService;

	@PostMapping("/password-reset/send-otp")
	public ResponseEntity<String> sendOtpForPasswordReset(@RequestBody OtpRequest otpRequest) {
		return authService.sendOtpForPasswordReset(otpRequest);
	}

	@PostMapping("/password-reset/verify-otp")
	public ResponseEntity<String> verifyOtpAndIssueResetToken(
			@RequestBody OtpVerificationRequest otpVerificationRequest) {
		return authService.verifyOtpAndIssueResetToken(otpVerificationRequest);
	}

	@PostMapping("/password-reset")
	public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
		return authService.resetPassword(resetPasswordRequest);
	}

}