package com.sk.projecteuler;

public class LargestPalindrome {

	public static void main(String[] args) {
		Integer largestPalindrome = 0;
		Integer fNum = 0;
		Integer sNum = 0;
		for (Integer i = 100; i <= 999; i++) {
			for (Integer j = i; j <= 999; j++) {
				Integer mulNum = i * j;
				Integer revNum = reverseNumber(mulNum);
				if (mulNum.equals(revNum) && largestPalindrome < mulNum) {
					fNum = i;
					sNum = j;
					largestPalindrome = mulNum;
				}
			}
		}
		System.out.println("Largest palindrome made from the product of two 3-digit numbers " + fNum + " * " + sNum
				+ " is " + largestPalindrome);

		/*
		 * int value = 0; for (int i = 100; i <= 999; i++) { for (int j = i; j <= 999;
		 * j++) { int value1 = i * j; StringBuilder sb1 = new StringBuilder("" +
		 * value1); String sb2 = "" + value1; sb1.reverse(); if
		 * (sb2.equals(sb1.toString()) && value < value1) { value = value1; } } }
		 * System.out.println(value);
		 */
	}

	private static Integer reverseNumber(Integer number) {
		Integer revNum = 0;
		while (number != 0) {
			revNum = (revNum * 10) + (number % 10);
			number /= 10;
		}
		return revNum;
	}
}
