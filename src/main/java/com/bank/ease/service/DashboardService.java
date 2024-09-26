package com.bank.ease.service;

import com.bank.ease.dto.AccountResponse;
import com.bank.ease.dto.UserResponse;

public interface DashboardService {
	UserResponse getUserDetails(String accountNumber);

	AccountResponse getAccountDetails(String accountNumber);
}