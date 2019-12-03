package com.sk.projecteuler;

public class SmallestNumberDIV {

	public static void main(String[] args) {
		int number = Integer.MAX_VALUE;
		int result = 0;
		boolean flag = false;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i % j == 0) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
