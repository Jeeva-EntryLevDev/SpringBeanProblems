package com.springcore;

import org.springframework.stereotype.Component;

@Component("messageService")
public class SMSSender implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Mesage sent : " + message);

	}

}
