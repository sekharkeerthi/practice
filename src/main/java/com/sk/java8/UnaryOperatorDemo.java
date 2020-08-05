package com.sk.java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> unaryOperator = (x) -> {
			return "Welcome " + x;
		};

		System.out.println(unaryOperator.apply("Sekhar"));

		// Instantiate the UnaryOperator interface
		UnaryOperator<String> opStr = UnaryOperator.identity();

		// Apply identify() method
		System.out.println(opStr.apply("djflasdfk"));

		UnaryOperator<Integer> opInt = UnaryOperator.identity();

		System.out.println(opInt.apply(17));

		UnaryOperator<Integer> xor = a -> a ^ 1;
		System.out.println(xor.apply(3));
		UnaryOperator<Integer> and = a -> a & 1;
		System.out.println(and.apply(3));
		Function<Integer, Integer> compose = xor.andThen(and);
		System.out.println(compose.apply(3));

	}

}
