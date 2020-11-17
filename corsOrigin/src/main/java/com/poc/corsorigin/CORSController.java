package com.poc.corsorigin;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CORSController {

	private static final String pattern = "HAi, %s!";
	private final AtomicLong count = new AtomicLong();
	
	
	  @CrossOrigin(origins = "http://localhost:8080")
	  @GetMapping("/model") public Model modelMethod(@RequestParam(required =
	  false, defaultValue = "kathir") String name) {
	  System.out.println("getting into the modelMethod");
	  
	  return new Model(count.incrementAndGet(), String.format(pattern, name)); }
	 
	
	
	@GetMapping("/modelwithoutcros")
	public Model modelMethodwithoutCros(@RequestParam(required = false , defaultValue = "kathirvikki" ) String name)
	{
		System.out.println("getting into the modelMethod with out cros");
		return new Model(count.incrementAndGet(), String.format(pattern, name));
	}
}
