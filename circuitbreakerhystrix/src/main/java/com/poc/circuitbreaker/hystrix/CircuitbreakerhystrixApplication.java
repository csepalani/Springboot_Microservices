package com.poc.circuitbreaker.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class CircuitbreakerhystrixApplication {
	
	@Autowired
	private ConsumingService consumingService;
	
	@Bean
	public RestTemplate rest(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	@RequestMapping(value = "/consuming")
	public String consumeMethod()
	{
		return consumingService.consumingList();
	}

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerhystrixApplication.class, args);
	}

}
