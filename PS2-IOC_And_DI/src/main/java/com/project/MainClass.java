package com.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class))
		{
			EmailService emailservice = context.getBean(EmailService.class);
			emailservice.start();
		}
	}

}
