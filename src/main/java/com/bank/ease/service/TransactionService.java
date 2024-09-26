package com.bank.ease.service;

import java.util.List;

import com.bank.ease.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);

}
