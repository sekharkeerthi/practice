package com.sk.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedReduceMaxMinConcatDemo {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(10, 2, 34, 15, 27);
		List<Integer> list = s1.sorted().collect(Collectors.toList());
		System.out.println(list);

		Stream<Integer> s2 = Stream.of(10, 2, 34, 15, 27);

		Optional<Integer> min = s2.min(Comparator.naturalOrder());
		System.out.println(min.get());

		Stream<Integer> s3 = Stream.of(10, 2, 34, 15, 27);

		Optional<Integer> max = s3.max((x, y) -> {
			return x.compareTo(y);
		});
		// Optional<Integer> max = s3.max(Comparator.naturalOrder());
		System.out.println(max.get());

		Stream<Integer> s4 = Stream.of(10, 2, 34, 15, 27);
		Stream<String> s5 = Stream.of("a", "d", "e", "p", "o");
		Stream<Object> objStream = Stream.concat(s4, s5);

		objStream.forEach(x -> System.out.print(x + " "));

		Stream<String> s6 = Stream.of("S", "E", "K", "H", "A", "R");

		Optional<String> str = s6.reduce((x, y) -> {
			return x + y;
		});
		if (str.isPresent())
			System.out.println(str.get());
	}

}
