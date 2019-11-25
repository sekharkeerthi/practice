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
		List<String> list2 = new ArrayList<String>() {
			{
				add("sjfhasd");
				add("jdfhasdfh");
			}
		};

		Consumer<String> c1 = s -> {
			System.out.println(s + " hi");
		};
		
		Consumer<String> c2 = s -> {
			System.out.println(s + " hello");
		};
		
		Consumer<String> c3 = c1.andThen(c2);

		list2.stream().forEach(c3);

	}
}
