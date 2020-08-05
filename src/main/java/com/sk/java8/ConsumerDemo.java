/**
 * 
 */
package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Sekhar Keerthi
 *
 */
public class ConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("serial")
		List<Integer> list2 = new ArrayList<Integer>() {
			{
				add(1); // c1 and c2
				add(2); // c1 and c2
			}
		};

		Consumer<Integer> c1 = s -> {
			System.out.println(s + 1);
		};
		
		Consumer<Integer> c2 = s -> {
			System.out.println(s + 2);
		};
		
		Consumer<Integer> c3 = c1.andThen(c2);

		list2.stream().forEach(c3);

	}
}
