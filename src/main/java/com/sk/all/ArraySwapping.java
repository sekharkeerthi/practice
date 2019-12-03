package com.sk.all;

public class ArraySwapping {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int mid = arr.length / 2;
		arr = reverse(arr, mid);
		arr = swapFirstHalf(arr, mid);
		arr = swapSecondHalf(arr, mid);
		// arr = moveMidToLast(arr, mid);
		System.out.println(arr);
	}

	private static int[] reverse(int[] arr, int mid) {
		for (int i = 0; i < mid; i++) {
			arr[i] = arr[i] + arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = arr[i] - arr[arr.length - (i + 1)];
			arr[i] = arr[i] - arr[arr.length - (i + 1)];
		}
		return arr;
	}

	private static int[] swapFirstHalf(int[] arr, int mid) {
		for (int i = 0; i < mid - 1; i++) {
			arr[i] = arr[i] + arr[mid - 1];
			arr[mid - 1] = arr[i] - arr[mid - 1];
			arr[i] = arr[i] - arr[mid - 1];
		}
		return arr;
	}

	private static int[] swapSecondHalf(int[] arr, int mid) {
		for (int i = mid + 1; i < arr.length - 1; i++) {
			arr[i] = arr[i] + arr[arr.length - 1];
			arr[arr.length - 1] = arr[i] - arr[arr.length - 1];
			arr[i] = arr[i] - arr[arr.length - 1];
		}
		return arr;
	}

	private static int[] moveMidToLast(int[] arr, int mid) {
		arr[mid] = arr[mid] + arr[arr.length - 1];
		arr[arr.length - 1] = arr[mid] - arr[arr.length - 1];
		arr[mid] = arr[mid] - arr[arr.length - 1];
		return arr;
	}
}
