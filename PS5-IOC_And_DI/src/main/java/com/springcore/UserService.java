package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private final Logger logger;

	@Autowired
	public UserService(Logger logger) {
		super();
		this.logger = logger;
	}
	
	public void processUser(){
		logger.log("User Service Started");
	}
}
