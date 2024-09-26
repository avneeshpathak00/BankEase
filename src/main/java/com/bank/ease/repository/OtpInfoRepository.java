package com.bank.ease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ease.entity.OtpInfo;

@Repository
public interface OtpInfoRepository extends JpaRepository<OtpInfo, Long> {

	OtpInfo findByAccountNumberAndOtp(String accountNumber, String otp);

	OtpInfo findByAccountNumber(String accountNumber);
}
