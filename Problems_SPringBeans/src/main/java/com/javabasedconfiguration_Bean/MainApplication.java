package com.javabasedconfiguration_Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
			Car car = context.getBean(Car.class);
			car.drive();
		}

	}

}
