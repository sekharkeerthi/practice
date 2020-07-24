/**
 * 
 */
package com.sk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Sekhar Keerthi
 *
 */
public class ComparableImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("ss");
				add("a");
				add("yss44564565656456456456456456456456sfgsfdgsfgsdfgsdfgsfgsdfgsdfgsdffgsdfgsdfgsdfgsdfgsdfgsdfgsdfg");
			}
		};

		/*
		 * Collections.sort(list); System.out.println(list);
		 */

		Comparator<String> com = (String s1, String s2) -> Integer.compare(s2.length(), s1.length());
		Collections.sort(list, com);
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("yss44564565656456456456456456456456sfgsfdgsfgsdfgsdfgsfgsdfgsdfgsdffgsdfgsdfgsdfgsdfgsdfgsdfgsdfg", 1);
		System.out.println(map);
		
		List<Employee> empList = new ArrayList<Employee>() {
			{
				add(new Employee("Sai", 23));
				add(new Employee("Uday", 04));
				add(new Employee("Chaitu", 18));
				add(new Employee("Gopi", 12));
			}
		};

		// Sorting using Comparable
		Collections.sort(empList);
		System.out.println(empList);

		// Sorting using Comparator
		Collections.sort(empList, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(empList);

		// Sorting using Comparator for two fields
		Collections.sort(empList, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
		System.out.println(empList);

		// Sorting using Comparator for two fields
		Collections.sort(empList, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName).reversed());
		System.out.println(empList);

		// Sorting using Comparator for two fields
		Collections.sort(empList, Comparator.<Employee>naturalOrder());
		System.out.println(empList);

		List<Customer> customerList = new ArrayList<Customer>() {
			{
				add(new Customer(1, "abc", "xyz"));
				add(new Customer(2, "abdfsdc1", "xsfghyz"));
				add(new Customer(3, "adfbc2", "terxysfdgsdfz"));
				add(new Customer(4, "abfsdc3", "xsfgsdfyz"));
				add(new Customer(5, "sdgaabc4", "xtrrtyz"));
				add(new Customer(6, "tyrabc5", "srterxyz"));
				add(new Customer(7, "abc", "xyz"));
			}
		};
		System.out.println(customerList);
		List<Customer> finalList = customerList.stream()
				// operators to remove duplicates based on person name
				.collect(Collectors.groupingBy(Customer::getFirstName)).values().stream()
				// cut short the groups to size of 1
				.flatMap(customers -> customers.stream().limit(1))
				// collect distinct users as list
				.sorted(Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLaastName))
				.collect(Collectors.toList());
		System.out.println(finalList);

		List<Customer> distinctCustomers = customerList.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Customer::getLaastName))),
						ArrayList::new))
				.stream().sorted(Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLaastName))
				.collect(Collectors.toList());
		System.out.println(distinctCustomers);
	}

}
