/**
 * Sekhar Keerthi
 */
package com.sk.datastructures;

/**
 * @author sekhark
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 4, 15, 6, 17, 18, 19, 23, 25, 37 };
		int x = 18;
		int len = arr.length;
		int result = binarySearch(arr, x, len);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	private static int binarySearch(int arr[], int x, int len) {
		int l = 0, r = len - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		// if we reach here, then element was
		// not present
		return -1;
	}

}
