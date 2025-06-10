package com.project;

import org.springframework.stereotype.Component;

@Component
public class NotificationService 
{
	public void sendNotification() 
	{
		System.out.println("Notification is sending"); 	
	}
}
