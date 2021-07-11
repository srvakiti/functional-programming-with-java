package com.srinu.fp;

import java.util.List;
import java.util.stream.Collectors;

/**
 * # Exercise 10

Create a List with Even Numbers Filtered from the Numbers List
 * @author 03736R744
 *
 */
public class exercise10 {
	
	public static void main(String[] args) {
		List<Integer> numbers=List.of(55,89,12,89,44,1002);
		
		//numbers.stream().filter(x->x%2 == 0).map(x->x).collect(Collectors.toList()).forEach(System.out::println);;
		
		List<Integer> evennumberlist=numbers.stream().filter(x->x%2 == 0).map(x->x).collect(Collectors.toList());
		//evennumberlist.stream().forEach(System.out::println);
		System.out.println(evennumberlist);
	}

}
