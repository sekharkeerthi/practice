package com.sk.interview.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemStatement1Approach2 {

	public static void main(String[] args) {
		List<Integer> resultArr1 = twiceRepeatedNumber(new int[] { 10, 12, 10, 11, 13, 17, 16, 15, 11 });
		System.out.println("Result1: " + resultArr1);
		List<Integer> resultArr2 = twiceRepeatedNumber(new int[] { 7, 3, 8, 6, 4, 6, 7, 8, 9, 8, 7 });
		System.out.println("Result2: " + resultArr2);
	}

	private static List<Integer> twiceRepeatedNumber(int[] inputArr) {
		return Arrays.stream(inputArr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 2).map(e -> e.getKey()).collect(Collectors.toList());
	}

}
