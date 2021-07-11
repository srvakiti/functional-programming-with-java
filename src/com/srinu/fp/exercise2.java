package com.srinu.fp;

import java.util.List;

/**
 * 
 * @author 03736R744
 *Print All Courses individually

*`List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")`
 */
public class exercise2 {

	public static void main(String[] args) {
			

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream().forEach(System.out::println);
		
	}
}
