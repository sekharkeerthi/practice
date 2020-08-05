package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DistinctLimitPeekDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 6, 8, 3, 5, 7, 6);
		
		List<Integer> distinctList = list.stream().distinct().limit(10).collect(Collectors.toList());
		System.out.println(distinctList);
		
		List<Integer> peekList = list.stream().peek(x -> System.out.println(x*x)).collect(Collectors.toList());
		System.out.println("Count:" +list.stream().peek(x -> System.out.println(x*x)).count());
	
		Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
        /* limit is set to 5 which means only 5 numbers will be printed
        with the help of terminal operation forEach
        */
        
	}

}
