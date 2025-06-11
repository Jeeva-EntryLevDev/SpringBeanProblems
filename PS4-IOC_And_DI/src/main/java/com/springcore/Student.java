package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private Course course;

	@Autowired	
	public void setCourse(Course course) {
		this.course = course;
	}

	public void enroll() {
        System.out.println("Student enrolled successfully!");
        course.courseDetails();
    }
	
	
}
