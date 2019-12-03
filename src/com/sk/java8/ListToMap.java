package com.sk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		List<A1> list = new ArrayList<A1>() {
			{
				add(new A1(1, "A1", "D1"));
				add(new A1(2, "A2", "D2"));
			}
		};
		System.out.println(list);
		Map<Integer, A1> map = list.stream().collect(Collectors.toMap(A1::getId, Function.identity()));
		Map<Integer, List<A1>> map1 = list.stream().collect(Collectors.groupingBy(a -> a.getId()));
		Map<Integer, List<A1>> map2 = list.stream().collect(Collectors.groupingBy(A1::getId, Collectors.toList()));
		Map<Integer, List<A1>> map3 = list.stream()
				.collect(Collectors.groupingBy(a -> a.getId(), Collectors.mapping(a -> a, Collectors.toList())));
		Map<Integer, String> map4 = list.stream()
				.collect(Collectors.toMap(A1::getId, A1::getName, (oldValue, newValue) -> oldValue));
		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		System.out.println(map4);
		
		
		@SuppressWarnings("serial")
		List<A1> list2 = new ArrayList<A1>() {
			{
				add(new A1(2, "A2", "D2"));
				add(new A1(2, "A2", "D2"));
				add(new A1(2, "A2", "D2"));
				add(new A1(2, "A2", "D2"));
				add(new A1(1, "A1", "D1"));
				add(new A1(1, "A1", "D1"));
			}
		};

		System.out.println(list2.stream().max((A1 a1, A1 a2) -> a1.getId().compareTo(a2.getId())).get());
		System.out.println(Arrays.toString(list2.stream().distinct().toArray()));
		System.out.println(Arrays.toString(list2.stream().map(l -> l.getId()).distinct().toArray()));
		System.out.println(Arrays.toString(list2.stream().mapToInt(l -> l.getId()).distinct().sorted().toArray()));
		System.out.println(list2.stream().distinct().findFirst());
	}
}
