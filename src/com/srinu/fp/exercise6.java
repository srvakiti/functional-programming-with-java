
/**
 * # Exercise 6

Print the number of characters in each course name
 */
package com.srinu.fp;

import java.util.List;

public class exercise6 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream().map(s->s +" "+s.length()).forEach(System.out::println);
		
	}
}
