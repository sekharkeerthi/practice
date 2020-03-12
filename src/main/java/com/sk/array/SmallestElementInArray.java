package com.sk.array;

import java.util.Arrays;

public class SmallestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 8, 4, 5, 3, 7, 4, 7 };
		int smallest = arr[0];

		for (int num : arr) {
			if (num < smallest)
				smallest = num;
		}
		System.out.println("Smallest is : " + smallest);
		System.out.println("Smallest is : " + Arrays.stream(arr).min().getAsInt());
	}

}
