package com.bank.ease.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bank.ease.dto.LoginRequest;
import com.bank.ease.dto.OtpRequest;
import com.bank.ease.dto.OtpVerificationRequest;
import com.bank.ease.entity.User;
import com.bank.ease.exception.InvalidTokenException;
import com.bank.ease.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest, HttpServletRequest request)
			throws InvalidTokenException {

		return userService.login(loginRequest, request);
	}

	@PostMapping("/generate-otp")
	public ResponseEntity<String> generateOtp(@RequestBody OtpRequest otpRequest) {
		return userService.generateOtp(otpRequest);
	}

	@PostMapping("/verify-otp")
	public ResponseEntity<String> verifyOtpAndLogin(@RequestBody OtpVerificationRequest otpVerificationRequest)
			throws InvalidTokenException {

		return userService.verifyOtpAndLogin(otpVerificationRequest);
	}

	@PostMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@GetMapping("/logout")
	public ModelAndView logout(@RequestHeader("Authorization") String token) throws InvalidTokenException {

		return userService.logout(token);
	}

}