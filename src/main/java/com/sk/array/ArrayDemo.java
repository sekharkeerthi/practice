package com.sk.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 10, 6, 8, 7 };
		if (arr != null && arr.length > 0) {
			int first = arr[0];
			for (int a : arr) {
				if (a > first) {
					first = a;
				}
			}
			System.out.println(first);

			int largest = arr[0];
			int secondLargest = arr[0];

			for (int a : arr) {
				if (a > largest) {
					secondLargest = largest;
					largest = a;
				} else if (a > secondLargest) {
					secondLargest = a;
				}
			}
			System.out.println(secondLargest);
		}
	}
}
