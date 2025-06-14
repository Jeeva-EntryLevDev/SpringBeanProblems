package com.problem3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService 
{
	private DatabaseConfig databaseConfig;

	@Autowired
	public void setDatabasConfig(DatabaseConfig databaseConfig) {
		this.databaseConfig = databaseConfig;
	}
	
	public void settingProperties(String URL, String username, String password) 
	{
		databaseConfig.setUsername(username);
		databaseConfig.setPassword(password);
		databaseConfig.setURL(URL);
	}
	
	public void setConnection() 
	{
		databaseConfig.startConnection();
	}
	
	
}
