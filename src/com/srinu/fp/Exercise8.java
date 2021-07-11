package com.srinu.fp;

import java.util.List;
import java.util.Optional;

/**
 * # Exercise 8 

Cube every number in a list and find the sum of cubes
 * @author 03736R744
 *
 */
public class Exercise8 {
	
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,3);
		
		Optional<Integer> cubednumbers= numbers.stream().map(x->x*x*x).reduce(Integer::sum);
		
		if(cubednumbers.isPresent())
		{
			System.out.println(cubednumbers.get());
		}
	}
	
	

}
