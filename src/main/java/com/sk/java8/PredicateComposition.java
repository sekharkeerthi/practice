package com.sk.java8;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateComposition {

	public static void main(String[] args) {
		Predicate<String> startsWithA = (text) -> text.startsWith("A");
		Predicate<String> endsWithX = (text) -> text.endsWith("x");

		Predicate<String> composedAnd = startsWithA.and(endsWithX);

		String input = "A hardworking person must relax";
		boolean result = composedAnd.test(input);
		System.out.println(result);

		Predicate<String> composedOr = startsWithA.or(endsWithX);

		result = composedOr.test(input);
		System.out.println(result);

		PredicateComposition pc = new PredicateComposition();

		Stream.of("sekhar", "keerthi").forEach(pc::print);
	}

	void print(String message) {
		System.out.println(message);
	}

}
