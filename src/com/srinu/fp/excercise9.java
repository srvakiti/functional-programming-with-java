package com.srinu.fp;

import java.util.List;
import java.util.Optional;

/*
# Exercise 9 

Find Sum of Odd Numbers in a list*/
public class excercise9 {
	
	public static void main(String[] args) {
		
List<Integer> numbers = List.of(2,3,5,7,8,12,15);
		
		Optional<Integer> sumofodnumbers= numbers.stream().filter(x-> x%2 != 0).reduce(Integer::sum);
		
		if(sumofodnumbers.isPresent())
		{
			System.out.println(sumofodnumbers.get());
		}
	}

}
