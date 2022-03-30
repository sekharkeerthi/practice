package com.sk.java8;

import java.util.function.Function;

public class FunctionComposition {

	public static void main(String[] args) {
		Function<Integer, Integer> multiply = (value) -> value * 2;
		Function<Integer, Integer> add = (value) -> value + 3;

		Function<Integer, Integer> addThenMultiplyCompose = multiply.compose(add);
		Function<Integer, Integer> multiplyThenAddCompose = add.compose(multiply);

		Integer result1 = addThenMultiplyCompose.apply(3);
		System.out.println(result1);
		
		result1 = multiplyThenAddCompose.apply(3);
		System.out.println(result1);
		
		
		Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

		Integer result2 = multiplyThenAdd.apply(3);
		System.out.println(result2);
		
		Function<Integer, Integer> addThenMultiply = add.andThen(multiply);

		result2 = addThenMultiply.apply(3);
		System.out.println(result2);

	}

}
