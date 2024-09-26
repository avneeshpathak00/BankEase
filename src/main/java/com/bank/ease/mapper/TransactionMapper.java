package com.bank.ease.mapper;

import org.springframework.stereotype.Component;

import com.bank.ease.dto.TransactionDTO;
import com.bank.ease.entity.Transaction;

@Component
public class TransactionMapper {

	public TransactionDTO toDto(Transaction transaction) {
		return new TransactionDTO(transaction);
	}

}