package com.sk.interview;

import java.util.Arrays;
import java.util.Objects;

public class RemoveDupAndSortArray {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 1, 2, 1, 3, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}

		Arrays.stream(arr).forEach(System.out::print);

		Integer[] result = new Integer[arr.length];
		int index = 0;
	//	int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
			//	temp = arr[i];
				result[index] = arr[i];
				index++;
			}
			else if (/*temp*/arr[i - 1] != arr[i]) {
				result[index] = arr[i];
				//temp = result[index];
				index++;
			}
		}
		System.out.println("");
		Arrays.stream(result).filter(Objects::nonNull).forEach(System.out::print);
	}

}
