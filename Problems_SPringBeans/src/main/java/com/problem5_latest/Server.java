package com.problem5_latest;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Server implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Server is starting up");
		
	}

	public void run(){
		System.out.println("Server is running");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Server is shutting down...");
		
	}
	
}
