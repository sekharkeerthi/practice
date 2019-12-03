package com.sk.interview;

import java.util.Arrays;

class SplitArraySwap {

	// Function to split array into two parts in Java
	public static void main(String[] args) {

		approach1();
		approach2();
		approach3();
		approach4();
	}

	// Function to split array into two parts and merge
	public static void approach1() {
		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;

		// Take two arrays
		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		// Store values into both arrays from source
		for (int i = 0; i < n; i++) {
			if (i < a.length)
				a[i] = inp[i];
			else
				b[i - a.length] = inp[i];
		}

		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));

		int[] result = new int[b.length + a.length];

		System.arraycopy(b, 0, result, 0, b.length);
		System.arraycopy(a, 0, result, b.length, a.length);

		System.out.println(Arrays.toString(result));
	}

	// Function to split array into two parts and merge
	public static void approach2() {

		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;

		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		System.arraycopy(inp, 0, a, 0, a.length);
		System.arraycopy(inp, a.length, b, 0, b.length);

		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));

		// Merge Two Arrays
		int[] result = new int[b.length + a.length];

		System.arraycopy(b, 0, result, 0, b.length);
		System.arraycopy(a, 0, result, b.length, a.length);

		System.out.println(Arrays.toString(result));
	}

	// Function to split array into two parts and merge
	public static void approach3() {

		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;

		int[] a = Arrays.copyOfRange(inp, 0, (n + 1) / 2);
		int[] b = Arrays.copyOfRange(inp, (n + 1) / 2, n);

		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));

		// Merge Two Arrays
		int[] result = new int[b.length + a.length];

		System.arraycopy(b, 0, result, 0, b.length);
		System.arraycopy(a, 0, result, b.length, a.length);

		System.out.println(Arrays.toString(result));
	}

	private static void approach4() {
		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;

		// Take two arrays
		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		// Store values into both arrays from source
		for (int i = 0; i < n; i++) {
			if (i < a.length)
				a[i] = inp[i];
			else
				b[i - a.length] = inp[i];
		}

		int[] result = new int[b.length + a.length];
		int count = 0;

		for (int i = 0; i < b.length; i++) {
			result[i] = b[i];
			count++;
		}

		for (int j = 0; j < a.length; j++) {
			result[count++] = a[j];
		}

		System.out.println(Arrays.toString(result));
	}
}