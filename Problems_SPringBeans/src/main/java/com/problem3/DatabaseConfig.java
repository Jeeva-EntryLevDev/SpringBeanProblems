package com.problem3;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConfig {
	private String username, URL, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void startConnection() 
	{
		System.out.println("Connection made");
	}
	
}
