package com.sk.interview;

import java.util.Arrays;
import java.util.Collections;

public class SecondeMaximumInList {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 4, 7, 3, 5, 6, 3, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println(arr[1]);
		
		System.out.println(Arrays.stream(arr).limit(2).min().getAsInt());
		System.out.println(Arrays.stream(arr).limit(arr.length - 1).min().getAsInt());
		
		Integer arr2[] = { 2, 3, 1, 4, 7, 3, 5, 6, 3, 5 };
		
		Collections.sort(Arrays.asList(arr2), Collections.reverseOrder());
		System.out.println(arr2);
		System.out.println(Arrays.stream(arr2).limit(2).min(Integer::compareTo).get());
		
	}

}
