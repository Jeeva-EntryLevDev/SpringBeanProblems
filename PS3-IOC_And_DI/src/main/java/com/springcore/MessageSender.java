package com.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender 
{
	private final MessageService messageService;

	public MessageSender(@Qualifier("emailService") MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	
	public void processMessage(String message) 
	{
		messageService.sendMessage(message);
	}
	
	
	//✅ You can switch "emailService" to "smsService" in the @Qualifier to change behavior — without modifying the business logic.
	
}
