package com.srinu.fp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * # Exercise 7

Square every number in a list and find the sum of squares
 * @author 03736R744
 *
 */
public class exercise7 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(9,7,5,2,8,3);
		/*
		 * List<Integer> squaredNumbers = numbers.stream() .map(number -> number *
		 * number) //Stream<R> .collect(Collectors.toList()); //R
		 */
		Optional<Integer> squarednumbers= numbers.stream().map(x->x*x).reduce(Integer::sum);
		
		if(squarednumbers.isPresent())
		{
			System.out.println(squarednumbers.get());
		}
		
		
	}

}
