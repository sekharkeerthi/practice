package com.sk.java8;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> function = (String x) -> {
			return x.length();
		};

		System.out.println(function.apply("Sekhar Keerthi"));

		Function<String, String> function1 = (x) -> {
			return "Welcome " + x;
		};

		System.out.println(function1.apply("Sekhar"));

		ToIntFunction<String> toIntFunction = (x) -> {
			return x.length();
		};

		System.out.println(toIntFunction.applyAsInt("Keerthi"));

		
		IntFunction<Integer> intFunction = (int x) -> {
			return x * x;
		};
		
		System.out.println(intFunction.apply(10));
	}

}
