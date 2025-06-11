package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
			UserService userservice = context.getBean(UserService.class);
			userservice.processUser();
			
			OrderService orderservice = context.getBean(OrderService.class);
			orderservice.processOrder();
		}
	}

}
