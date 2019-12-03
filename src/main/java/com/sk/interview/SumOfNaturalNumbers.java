package com.sk.interview;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		System.out.println(sum(100));
		System.out.println(addNumbers(100)); // recursion
	}

	private static Integer sum(Integer number) {
		Integer sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public static int addNumbers(int num) {
		if (num != 0)
			return num + addNumbers(num - 1);
		else
			return num;
	}
}
