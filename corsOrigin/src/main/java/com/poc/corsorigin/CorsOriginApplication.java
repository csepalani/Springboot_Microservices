package com.poc.corsorigin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CorsOriginApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsOriginApplication.class, args);
	}

	@Bean
	public 	WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry corsregistry)
			{
				corsregistry.addMapping("/modelwithoutcros").allowedOrigins("http://localhost:8080");
			}
		};
	}
}
