package com.bank.ease.service;

import org.springframework.stereotype.Service;

import com.bank.ease.dto.AccountResponse;
import com.bank.ease.dto.UserResponse;
import com.bank.ease.exception.NotFoundException;
import com.bank.ease.repository.AccountRepository;
import com.bank.ease.repository.UserRepository;
import com.bank.ease.util.ApiMessages;

import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {

	private final UserRepository userRepository;
	private final AccountRepository accountRepository;

	@Override
	public UserResponse getUserDetails(String accountNumber) {
		val user = userRepository.findByAccountAccountNumber(accountNumber).orElseThrow(() -> new NotFoundException(
				String.format(ApiMessages.USER_NOT_FOUND_BY_ACCOUNT.getMessage(), accountNumber)));

		return new UserResponse(user);
	}

	@Override
	public AccountResponse getAccountDetails(String accountNumber) {
		val account = accountRepository.findByAccountNumber(accountNumber);
		if (account == null) {
			throw new NotFoundException(
					String.format(ApiMessages.USER_NOT_FOUND_BY_ACCOUNT.getMessage(), accountNumber));
		}

		return new AccountResponse(account);
	}

}