package com.sk.java8;

import java.util.stream.Stream;

public class MatchMethodsDemo {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(4, 6, 7, 8, 2, 9);
		/*
		 * boolean hasEven = stream.anyMatch(x -> x %2 == 0);
		 * System.out.println("List has even numbers :" + hasEven);
		 */
		/*
		 * boolean allEven = stream.allMatch(x -> x %2 == 0);
		 * System.out.println("List has all even numbers :" + allEven);
		 */
		
		boolean noneEven = stream.noneMatch(x -> x %10 == 0);
		System.out.println("List has no even numbers :" + noneEven);
	}

}
