package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}



	public void drive() {
		engine.start();
		System.out.println("Car is drving");
	}
}
