package com.sk.datastructures;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr1 = { 56, 34, 78, 3, 4 };
		InsertionSort.sortAsc(arr1);
		for (int a : arr1) {
			System.out.print(a + "\t");
		}
		System.out.println();
		int[] arr2 = {85, 34, 12, 23, 37, 100 };
		InsertionSort.sortDesc(arr2);
		for (int a : arr2) {
			System.out.print(a + "\t");
		}
	}

	private static void sortAsc(int[] arr) {
		int j, key, i;
		for (j = 1; j < arr.length; j++) {
			key = arr[j];
			for (i = j - 1; (i >= 0) && (arr[i] > key); i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = key;
		}
	}

	private static void sortDesc(int[] arr) {
		int j, key, i;
		for (j = 1; j < arr.length; j++) {
			key = arr[j];
			for (i = j - 1; (i >= 0) && (arr[i] < key); i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = key;
		}
	}

}
