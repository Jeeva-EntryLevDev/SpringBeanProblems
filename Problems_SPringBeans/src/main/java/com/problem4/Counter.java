package com.problem4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")

public class Counter {
	private int count = 0;
	
	public void increment() {
		count++;
	}
	
	public int getCount() 
	{
		return count;
	}
}
