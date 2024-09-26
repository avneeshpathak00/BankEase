package com.bank.ease.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ease.entity.PasswordResetToken;
import com.bank.ease.entity.User;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

	Optional<PasswordResetToken> findByToken(String token);

	PasswordResetToken findByUser(User user);

	void deleteByToken(String token);
}
