package com.sk.java8;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class AggregationsDemo {

	public static void main(String[] args) {

		StringBuffer sb = null;

		Stream<Integer> stream = Stream.of(1, 2, 3);
		BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
		Integer id = 0;
		int red = stream.reduce(id, sum);
		System.out.println(red);

		stream = Stream.of(1);
		red = stream.reduce(id, sum);
		System.out.println(red);

		stream = Stream.empty();
		red = stream.reduce(id, sum);
		System.out.println(red);

		stream = Stream.empty();// Stream.of(1);//Stream.of(2,1,3);
		BinaryOperator<Integer> max = (i1, i2) -> (i1 > i2) ? i1 : i2;
		// Optional<Integer> value = stream.reduce(max);
		Optional<Integer> value = stream.max(Comparator.naturalOrder());
		if (value.isPresent())
			System.out.println(value.get());
		else
			System.out.println("Empty");

	}

}
