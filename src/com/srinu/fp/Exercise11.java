package com.srinu.fp;

import java.util.List;
import java.util.stream.Collectors;

/**8
 * # Exercise 11

Create a List with lengths of all course titles.
 * @author 03736R744
 *
 */
public class Exercise11 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		List<Integer> courseTitleLenght=courses.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(courseTitleLenght);
	}
}
