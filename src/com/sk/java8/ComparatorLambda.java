/**
 * 
 */
package com.sk.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 */
public class ComparatorLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};*/
		
		Comparator<String> c = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		List<String> list = Arrays.asList("**", "*", "***", "****","**");
		//list.sort(c);
		Collections.sort(list, c);
		for (String string : list) {
			System.out.println(string);
		}

	}

}
