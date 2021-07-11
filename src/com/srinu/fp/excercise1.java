package com.srinu.fp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class excercise1 {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>();
		
		  numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4);
		  numbers.add(5); numbers.add(6); numbers.add(7); numbers.add(12);
			/*
			 * for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
			 * Integer integer = (Integer) iterator.next(); System.out.println(integer);
			 * 
			 * }
			 */
		 //consumer functional interface
		//numbers.stream().forEach(System.out::println);
		//numbers.parallelStream().forEach(System.out::println);
		
		//predicate
		numbers.stream().filter(number -> number % 2 != 0) // Lamdba Expression
		.forEach(System.out::println);// Method Reference

		
		numbers.stream().filter(number -> number % 2 != 0).map(number ->number * number) // Lamdba Expression
		.forEach(System.out::println);// Method Reference
		
		//Terminal operators
		
	}
	
}
