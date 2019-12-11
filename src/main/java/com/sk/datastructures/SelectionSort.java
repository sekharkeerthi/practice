package com.sk.datastructures;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = { 56, 34, 78, 3, 4 };
		SelectionSort.selectionSortAscending(arr1);
		for (int a : arr1) {
			System.out.print(a + "\t");
		}
		System.out.println();
		int[] arr2 = { 72, 37, 65, 23, 12 };
		SelectionSort.selectionSortDescending(arr1);
		for (int a : arr2) {
			System.out.print(a + "\t");
		}
	}

	private static void selectionSortAscending(int[] arr) {
		int i, j, min_idx, temp;
		// One by one move boundary of unsorted sub array
		for (i = 0; i < arr.length; i++) {
			// Find the minimum element in unsorted array
			min_idx = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// Swap the found minimum element with the first element
			temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	private static void selectionSortDescending(int[] arr) {
		int i, j, first, temp;
		// One by one move boundary of unsorted sub array
		for (i = arr.length - 1; i > 0; i--) {
			first = 0; // initialize subscript of first element
			for (j = 1; j <= i; j++) // locate smallest element between 1 and i
			{
				if (arr[j] < arr[first])
					first = j;
			}
			// Swap the smallest found with element in position i
			temp = arr[first];
			arr[first] = arr[i];
			arr[i] = temp;
		}
	}

}
