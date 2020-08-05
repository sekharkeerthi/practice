package com.sk.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountToArrayCollectDemo {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		/*
		 * long count = stream.filter(x -> x % 2 == 0).count();
		 * System.out.println(count); stream.close();
		 */
		/*
		 * Object[] array = stream.filter(x -> x % 2 == 0).toArray();
		 * System.out.println(Arrays.asList(array));
		 */

		List<Integer> list = stream.filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
	}
}
