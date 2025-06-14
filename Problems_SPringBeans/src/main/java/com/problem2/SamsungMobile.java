package com.problem2;

import org.springframework.stereotype.Component;

@Component
public class SamsungMobile implements Mobile {
	
	@Override
	public void displayMessage() {
		System.out.println("I am a Samsung Mobile");	
	}

}
