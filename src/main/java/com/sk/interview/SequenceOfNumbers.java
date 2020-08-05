package com.sk.interview;

public class SequenceOfNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 5, 4, 6, 7, 9, 8, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println(arr);
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
