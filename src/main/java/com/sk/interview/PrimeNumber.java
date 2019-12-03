package com.sk.interview;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 2;
		if (num > 1) {
			int count = 0;
			for (int n = 2; n <= num / 2; n++) {
				if (num % 2 == 0) {
					count++;
					break;
				}
			}
			if (count > 0) {
				System.out.println("Non Prime");
			} else {
				System.out.println("Prime");
			}
		}

		for (int i = 0; i <= 31; i++) {
			if (i > 1) {
				int count = 0;
				for (int n = 2; n <= i / 2; n++) {
					if (i % 2 == 0) {
						count++;
						break;
					}
				}
				if (count <= 0) {
					System.out.println(i);
				}
			}
		}
	}
}
