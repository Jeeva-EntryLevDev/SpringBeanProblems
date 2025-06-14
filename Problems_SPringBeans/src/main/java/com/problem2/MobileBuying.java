package com.problem2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MobileBuying {
	private final Mobile mobile;

	@Autowired
	public MobileBuying(@Qualifier("appleMobile") Mobile mobile) {
		super();
		this.mobile = mobile;
	}
	
	public void showCase() 
	{
		mobile.displayMessage();
	}
	
}
