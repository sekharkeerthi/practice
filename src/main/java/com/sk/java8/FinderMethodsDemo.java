package com.sk.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class FinderMethodsDemo {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(6, 7, 1, 2, 3, 4, 5, 6);

		/*
		 * Optional<Integer> o = stream.filter(x -> x > 4).findAny(); if (o.isPresent())
		 * System.out.println(o.get());
		 */

		Optional<Integer> o = stream.filter(x -> x > 3).findFirst();
		if (o.isPresent())
			System.out.println(o.get());

	}

}
