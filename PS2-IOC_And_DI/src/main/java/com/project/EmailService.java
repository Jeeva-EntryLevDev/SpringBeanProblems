package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService 
{
	private final NotificationService notificationService;

	@Autowired
	public EmailService(NotificationService notificationservice) {
		this.notificationService = notificationservice;
	}
	
	public void start() 
	{
		notificationService.sendNotification();
		System.out.println("Successfully notifcation Sent"); 	
	}
	
}
