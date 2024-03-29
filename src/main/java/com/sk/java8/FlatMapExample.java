/**
 * Sekhar Keerthi
 */
package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
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
		Function<List<String>, Stream<String>> flatMapper = l -> l.stream(); // List::stream

		//list.stream().map(l -> l).forEach(System.out::println);
		list.stream().flatMap(l -> l.stream()).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		list.stream().flatMap(flatMapper).forEach(System.out::print);
		System.out.println();
		
		
		
		List<List<String>> Names = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John", "Michael"),
				Arrays.asList("Shawn", "Franklin"), Arrays.asList("Johnty", "Sean"));
		
		System.out.println(Names);

		/*
		 * Created a �List of List of type String� i.e. List<List<String>> Stored names
		 * into the list
		 */
		System.out.println("--------------------------------------------");
		List<String> Start = Names.stream().flatMap(List::stream).filter(s -> s.startsWith("S"))
				.collect(Collectors.toList());

		/*
		 * Converted it into Stream and filtered out the names which start with 'S'
		 */

		Start.forEach(System.out::println);
		System.out.println(Start);

		/*
		 * Printed the Start using forEach operation
		 */
	}
}
