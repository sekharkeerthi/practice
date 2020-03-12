package com.sk.array;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[] = { 8, 4, 5, 3, 7, 4, 7 };
		int largest = arr[0];

		for (int num : arr) {
			if (num > largest)
				largest = num;
		}
		System.out.println("Largest is : " + largest);
		System.out.println("Largest is : " + Arrays.stream(arr).max().getAsInt());
	}

}
