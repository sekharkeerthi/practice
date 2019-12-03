package com.sk.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Stream;

public class SummationDemo {

	public static void main(String[] args) {
		Summation summation = (Integer a, Integer b) -> (a + b);
		System.out.println(summation.sum(5, 6));

		Stream<Integer> stream = Stream.of(1, 2, 3);
		/*
		 * List<Integer> list =
		 * stream.filter(Predicate.isEqual(2)).collect(Collectors.toList());
		 * System.out.println(list);
		 */

		Comparator<Integer> comp = (Integer a, Integer b) -> a - b;

		System.out.println(stream.max(comp).get());

		List<Integer> list1 = new ArrayList<Integer>() {
			{
				add(2);
				add(7);
				add(5);
				add(2);
				add(6);
			}
		};

		List<Integer> list2 = new ArrayList<Integer>() {
			{
				add(2);
				add(7);
				add(8);
			}
		};

		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list1);
		set.addAll(list2);

		System.out.println(set);

		ListIterator<Integer> li = list1.listIterator();

	}
}
