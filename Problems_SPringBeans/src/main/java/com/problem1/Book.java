package com.problem1;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String title = "Clean Code";
    private String author = "Robert C. Martin";


	public void display() 
	{
		System.out.println("title : " + title + ", Author : " + author);
	}
	
}
