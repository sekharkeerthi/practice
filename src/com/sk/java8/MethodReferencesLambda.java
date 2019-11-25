/**
 * 
 */
package com.sk.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Sekhar Keerthi
 *
 */
public class MethodReferencesLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println("sekahr");
		System.out.println(c);

		Comparator<Integer> comparator = Integer::compare;
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 6, 3);
		Collections.sort(numbers, comparator);
		Consumer<Integer> con = s -> System.out.println(s);//System.out::println;
		numbers.forEach(con);
	}
}
