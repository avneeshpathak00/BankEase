package com.bank.ease.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.bank.ease.dto.GeolocationResponse;

public interface GeolocationService {

	@Async
	public CompletableFuture<GeolocationResponse> getGeolocation(String ip);
}