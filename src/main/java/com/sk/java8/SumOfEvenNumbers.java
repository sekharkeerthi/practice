package com.sk.java8;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(n -> (n % 2 ==
		// 0)).forEach(System.out::println);
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(isPrime()).forEach(System.out::println);
	}

	private static Predicate<? super Integer> isPrime() {
		return n -> {
			if (n == 1)
				return false;
			if (n == 2) {
				return true;
			} else {
				return isPrime(n);
			}
		};
	}

	private static boolean isPrime(Integer n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
