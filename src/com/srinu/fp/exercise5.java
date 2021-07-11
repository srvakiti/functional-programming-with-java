package com.srinu.fp;

import java.util.List;

/**
 * print the cubes of oddnumbers
 * @author 03736R744
 *
 */
public class exercise5 {

	List<Integer> numbers = List.of(9,7,5,2,8,3);
	
	

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(9,7,5,2,8,3);
		numbers.stream().filter(n->n%2 !=0).map(n->n*n*n).forEach(System.out::println);


	}
}
