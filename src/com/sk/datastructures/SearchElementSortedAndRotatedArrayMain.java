package com.sk.datastructures;

public class SearchElementSortedAndRotatedArrayMain {

	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		int arrSorted[] = { 2, 3, 4, 10, 40 };
		System.out.println("Index of element 5 : " + findElementRotatedSortedArray(arr, 0, arr.length - 1, 10));
		System.out.println("Index of element 5 : " + findElementRotatedSortedArray2(arrSorted, 0, arr.length - 1, 10));
	}

	public static int findElementRotatedSortedArray(int[] arr, int low, int high, int number) {
		int mid;
		while (low <= high) {
			mid = low + ((high - low) / 2);

			if (arr[mid] == number) {
				return mid;
			}
			if (arr[mid] <= arr[high]) {
				// Right part is sorted
				if (number > arr[mid] && number <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				// Left part is sorted
				if (arr[low] <= number && number < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

	public static int findElementRotatedSortedArray2(int[] arr, int low, int high, int number) {

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == number)
				return mid;
			if (arr[mid] < number)
				low = mid + 1;
			else
				high = mid - 1;

		}
		return -1;
	}
}