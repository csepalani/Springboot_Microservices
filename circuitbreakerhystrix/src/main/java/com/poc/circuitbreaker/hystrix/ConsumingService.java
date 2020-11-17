package com.poc.circuitbreaker.hystrix;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumingService {

	private final RestTemplate restTemplate;
	
	public ConsumingService(RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}
	
	@HystrixCommand(fallbackMethod = "failureFallBackMethod")
	public String consumingList()
	{
		URI uri = URI.create("http://localhost:8091/producer");
		return this.restTemplate.getForObject(uri, String.class);
	}
	
	public String failureFallBackMethod() {
		return "fallback method is calling";
	}
	
}
