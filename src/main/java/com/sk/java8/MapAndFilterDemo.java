package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilterDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 10, 16, 20, 23 ,21, 34, 36);
		List<Integer> squarelist = list.stream().filter(x -> (x % 2) == 0).map(x -> x*x).collect(Collectors.toList());
		System.out.println(squarelist);
	}

}
