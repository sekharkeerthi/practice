package com.sk.java8;

import java.util.ArrayDeque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Integer num = 537;
		char[] charArray = String.valueOf(num).toCharArray();
		String[] array = Stream.of(charArray).map(String::valueOf).toArray(String[]::new);
		Stream.of("5", "3", "7").collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator()
				.forEachRemaining(System.out::print);
	}
}
