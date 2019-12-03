/**
 * Sekhar Keerthi
 */
package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author sekhark
 *
 */
public class FlatMapExample {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("1", "2", "3", "1", "2", "3", "1", "2", "3");
		List<String> l2 = Arrays.asList("1", "2", "3", "1", "2", "3");
		List<String> l3 = Arrays.asList("1", "2", "3");

		List<List<String>> list = Arrays.asList(l1, l2, l3);

		System.out.println(list);

		Function<List<?>, Integer> function = List::size;
		Function<List<String>, Stream<String>> flatMapper = l -> l.stream();

		// list.stream().map(function).forEach(System.out::println);
		list.stream().map(flatMapper).forEach(System.out::println);
		list.stream().flatMap(flatMapper).forEach(System.out::println);
	}
}
