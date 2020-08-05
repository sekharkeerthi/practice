package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethodDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sekhar Keerthi", "Gowthami Bandaru", "Subba Lakshmi Keerthi", "Kondala Rao Keerthi");

		Stream<String> s = list.stream().flatMap((String x) -> {
			String[] str = x.split(" ");
			return Arrays.asList(str).stream();
		});
		/*
		 * List<String> myList= s.collect(Collectors.toList());
		 * System.out.println(myList);
		 */
		Consumer<String> consumer = l -> System.out.println(l);
		s.forEach(consumer);
		/*
		 * for (String str : s.collect(Collectors.toList())) { consumer.accept(str); }
		 */
	}

}
