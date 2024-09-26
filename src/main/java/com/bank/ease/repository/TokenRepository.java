package com.bank.ease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ease.entity.Account;
import com.bank.ease.entity.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

	Token findByToken(String token);

	Token[] findAllByAccount(Account account);

	void deleteByToken(String token);
}
