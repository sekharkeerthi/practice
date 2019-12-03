package com.sk.interview;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153, rem = 0, sum = 0, originalNum = num;
		while (num != 0) {
			rem = num % 10;
			num /= 10;
			sum = sum + (int) Math.pow(rem, 3);
		}
		if (originalNum == sum) {
			System.out.println("Armstrong Number");
		}

	}
}
