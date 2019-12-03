package com.sk.interview;

import java.util.*;

class Palindrome {
	public static void main(String args[]) {
		String inputString;
		Scanner in = new Scanner(System.in);

		System.out.println("Input a string");
		inputString = in.nextLine();

		String revString = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			revString += inputString.charAt(i);
		}

		if (inputString.equalsIgnoreCase(revString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

		int length = inputString.length();
		int i, begin, end, middle;

		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;

		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

		int num = 112211, revNum = 0;
		int actualNum = num;
		while (num != 0) {
			revNum = (revNum * 10) + (num % 10);
			num /= 10;
		}
		if (actualNum == revNum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}