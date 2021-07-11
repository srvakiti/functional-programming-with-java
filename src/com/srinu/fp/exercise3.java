package com.srinu.fp;

import java.util.List;

/**List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")`

# Exercise 3

Print Courses Containing the word "Spring"
**/
public class exercise3 {
	
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

		courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		
	}

}
