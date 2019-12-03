package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ChainPredicates {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("1", "2", "3");
		List<String> list = new ArrayList<>();
		Predicate<String> p1 = Predicate.isEqual("1");
		Predicate<String> p2 = Predicate.isEqual("2");

		stream.peek(System.out::println).filter(p1.or(p2)).forEach(list::add);
		System.out.println("Done");
		System.out.println("Size = " + list.size());

	}

}
