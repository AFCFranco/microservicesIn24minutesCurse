package com.in28minutes.microservices.limitsservice.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.Configuration;
import com.in28minutes.microservices.limitsservice.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(path="/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
		
	}

}
