package com.sk.java8;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (Integer i, Integer j) -> {
			return i * j;
		};
		
		System.out.println(biFunction.apply(10, 10));

	}

}
