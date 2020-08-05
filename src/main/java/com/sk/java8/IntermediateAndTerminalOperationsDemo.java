package com.sk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.stream.Stream;

public class IntermediateAndTerminalOperationsDemo {

	public static void main(String[] args) {
		System.out.println("Intermediate Operation won't execute");
		Arrays.stream(new int[] { 0, 1 }).map(i -> {
			System.out.println(i);
			return i;
			// No terminal operation so it won't execute
		});

		System.out.println("Terminal operation starts here");
		int sum = Arrays.stream(new int[] { 0, 1 }).map(i -> {
			System.out.println(i);
			return i;
			// This is followed by terminal operation sum()
		}).sum();

		System.out.println(sum);

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// Added the numbers into Arraylist
		System.out.println(list.stream().mapToInt(i -> i).sum());

		Stream<Integer> stream = Stream.of(100, 100, 9, 8, 200);

		OptionalDouble avg = stream.mapToInt(i -> i * i).filter(i -> i >= 100).average();
		if (avg.isPresent())
			System.out.println(avg.getAsDouble());

		stream = Stream.of(100, 100, 9, 8, 200);

		Spliterator<Integer> spliterator = stream.spliterator();
		spliterator.forEachRemaining(System.out::println);
		spliterator.trySplit();

		Integer highest = Stream.of(1, 2, 3, 77, 6, 5)./*max(Comparator.comparing(Integer::valueOf)).get()*/max(Comparator.naturalOrder()).get();

		/*
		 * We have used max() method with Comparator.comparing() method to compare and
		 * find the highest number
		 */

		Integer lowest = Stream.of(1, 2, 3, 77, 6, 5)./*min(Comparator.comparing(Integer::valueOf))*/min(Comparator.naturalOrder()).get();

		/*
		 * We have used max() method with Comparator.comparing() method to compare and
		 * find the highest number
		 */

		System.out.println("The highest number is: " + highest);
		System.out.println("The lowest number is: " + lowest);
	}
}
