package com.sk.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComnparatorLambda {

	public static void main(String[] args) {
		/*
		 * Comparator<String> comparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) {
		 * 
		 * return Integer.compare(o2.length(), o1.length()); } };
		 */

		Comparator<String> comparator2 = (String o1, String o2) -> o1.compareTo(o2);// Integer.compare(o2.length(),
																					// o1.length());

		List<String> list = Arrays.asList("****", "***", "*", "*****", "**");
		Collections.sort(list, comparator2);
		for (String s : list)
			System.out.println(s);
	}
}
