package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		Stream<Integer> s = list.stream();
		Stream<Integer> map = s.map(x -> x*x);
		long count = map.count();
		Object[] array = map.toArray();
		for(Object o : array)
			System.out.println(o);
		
		List<Integer> squareList = list.stream().map(x -> {return x*x;}).collect(Collectors.toList());
		System.out.println(squareList);
		List<Integer> cubeList = list.stream().map(x -> x*x*x).collect(Collectors.toList());
		System.out.println(cubeList);
	}

}
