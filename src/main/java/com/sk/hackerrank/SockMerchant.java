package com.sk.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		/*
		 * for (int i = 0; i < ar.length; i++) { int temp = 0; for (int j = i + 1; j <
		 * ar.length; j++) { if (ar[i] > ar[j]) { temp = ar[j]; ar[j] = ar[i]; ar[i] =
		 * temp; } } }
		 * 
		 * int first = ar[0]; int counter = 1; int pairs = 0; int length = ar.length;
		 * for (int i = 1; i < length; i++) { if (first == ar[i]) { counter++; if (i <
		 * (length - 1)) continue; } if (counter % 2 == 0) { pairs += counter / 2; }
		 * else { if (counter / 2 >= 1) { pairs += counter / 2; } } counter = 1; first =
		 * ar[i]; }
		 * 
		 * System.out.println(pairs);
		 */

		int occurance = 0;
		int pairs = 0;
		for (int i = 0; i < ar.length; i++) {
			occurance = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j])
					occurance++;
			}
			if (occurance % 2 == 0)
				pairs++;
		}
		return pairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		/*
		 * int n = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * int[] ar = new int[n];
		 * 
		 * String[] arItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < n; i++) { int arItem = Integer.parseInt(arItems[i]);
		 * ar[i] = arItem; }
		 */
		int ar[] = new int[] { 1,2,1,2,1,3,2 };
		int length = ar.length;
		int result = sockMerchant(length, ar);
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}