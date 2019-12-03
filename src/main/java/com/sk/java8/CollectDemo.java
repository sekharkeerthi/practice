/**
 * Sekhar Keerthi
 */
package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author sekhark
 *
 */
public class CollectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>() {
			{
				add(new Customer(1L, "Sekhar"));
				add(new Customer(2L, "Keerthi"));
				add(new Customer(3L, "Sekhar"));
				add(new Customer(4L, "Keerthi"));
			}
		};

		String name = customers.stream().filter(c -> c.getId() < 3L).map(c -> c.getName())
				.collect(Collectors.joining(", "));
		System.out.println(name);
		List<String> list = customers.stream().filter(c -> c.getId() < 3L).map(c -> c.getName())
				.collect(Collectors.toList());
		System.out.println(list);
		Map<Long, List<Customer>> maps = customers.stream().filter(c -> c.getId() < 3L)
				.collect(Collectors.groupingBy(Customer::getId));
		System.out.println(maps);
		Map<Long, Customer> maps2 = customers.stream().collect(Collectors.toMap(Customer::getId, Function.identity()));
		System.out.println(maps2);
		Map<String, Long> countMap = customers.stream()
				.collect(Collectors.groupingBy(Customer::getName, Collectors.counting()));
		System.out.println(countMap);
	}
}
