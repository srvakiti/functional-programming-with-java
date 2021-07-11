package com.srinu.fp;

import java.util.List;

/**
 * 
/**List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")`

# Exercise 4

Print Courses Whose Name has atleast 4 letters
**/
 
public class exercise4 {
	
	List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
	
	/*
	 * private void name() {
	 * 
	 * }
	 * 
	 * courses.st.filter(course -> course.length() >= 4). .fo
	 */
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().filter(s->s.length()>=4).forEach(System.out::println);
	}
}
