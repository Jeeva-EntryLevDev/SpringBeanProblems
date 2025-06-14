package com.problem5;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Server {
	@PostConstruct
	public void initiated()
	{
		System.out.println("Server has been initiated");
	}
	
	public Server() 
	{
		System.out.println("Lifecycle --> bean creation --> running initiated method --> dependencies are injected");
	}
	
	@PreDestroy
	public void destroy() 
	{
		System.out.println("Server has been destroyed");
	}
}
