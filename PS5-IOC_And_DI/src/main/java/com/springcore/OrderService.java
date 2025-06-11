package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	private final Logger logger;

	@Autowired
	public OrderService(Logger logger) {
		super();
		this.logger = logger;
	}
	
	public void processOrder(){
		logger.log("Order Service Started");
	}
}
