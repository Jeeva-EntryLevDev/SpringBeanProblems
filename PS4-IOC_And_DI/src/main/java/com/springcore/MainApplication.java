package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
			Student student = context.getBean(Student.class);
			student.enroll();
		}

	}

}
