package com.springcore;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailSender implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Email sent : " + message); 	
	}

}
