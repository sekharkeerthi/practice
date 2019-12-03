/**
 * Sekhar Keerthi
 */
package com.sk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author sekhark
 *
 */
public class ChainConsumers {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("1", "2", "3");
		List<String> result = new ArrayList<>();
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s -> result.add(s); // result::add;//System.out::println;//
		strings.forEach(c1.andThen(c2));
		System.out.println(result.size());
	}
}
