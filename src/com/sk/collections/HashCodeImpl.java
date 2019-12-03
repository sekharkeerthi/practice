package com.sk.collections;

public class HashCodeImpl {
	public static void main(String[] args) {
		System.out.println(hashCode("abc"));
	}

	public static int hashCode(String str) {
		if (str == null)
			return 0;
		int hash = 0;
		char[] arr = str.toCharArray();
		int length = str.length();
		for (int i = 1; i <= length; i++) {
			hash += arr[i - 1] * Math.pow(31, length - i);
		}
		return hash;
	}
}
