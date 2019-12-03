package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachLambda {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>() {
			{
				add(new Customer(1L, "Sekhar"));
				add(new Customer(2L, "Keerthi"));
			}
		};
		// customers.forEach(customer -> System.out.println(customer));
		// customers.forEach(System.out::println);

		/*
		 * String str = "Sekhar Keerthi";
		 * 
		 * Predicate<String> p = s -> s.length() < 20; p.test(str);
		 */

		Stream<Customer> stream = customers.stream();
		// stream.forEach(cus -> System.out.println(cus));

		// stream.filter(cus ->
		// cus.getName().equalsIgnoreCase("Keerthi")).forEach(System.out::println);

		Predicate<Customer> p = Predicate.isEqual(new Customer(2L, "Keerthi"));
		// stream.filter(p).forEach(System.out::println);
		// stream.peek(System.out::println).filter(p).peek(c)
	}
}
