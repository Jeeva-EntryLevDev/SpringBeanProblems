package com.javabasedconfiguration_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration    // Marks this class as a Spring Configuration
public class AppConfig {
	
	@Bean
	public Engine engine() {          //  // Defines a Bean managed by Spring

		return new Engine();
	}
	
	@Bean
	public Car car(Engine engine) {      // Injecting Engine into Car
		return new Car(engine);
	}
}
