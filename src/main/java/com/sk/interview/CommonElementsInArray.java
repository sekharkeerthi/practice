package com.sk.interview;

import java.util.Arrays;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4, 3, 5, 6, 5 };
		int commonArr[] = new int[arr.length];
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					commonArr[++index] = arr[i];
				}
			}
		}
		System.out.println(commonArr);

		int[] result = Arrays.stream(commonArr).filter(i -> {
			if (i != 0)
				return true;
			return false;
		}).toArray();
		System.out.println(result);
	}
}
