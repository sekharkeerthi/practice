package com.sk.collections;

import static java.util.Objects.isNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckDuplicatesInList {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>() {
			{
				add(new Employee("Sekhar", 31));
				add(new Employee("Sekhar", 31));
			}
		};
		System.out.println(getDuplicates(employees));
	}

	private static Boolean getDuplicates(final List<Employee> employees) {
		List<Employee> duplicates = employees.stream().filter(duplicateByKey(Employee::getName))
				.collect(Collectors.toList());
		if (duplicates != null && duplicates.isEmpty() == false) {
			return true;
		} else {
			return false;
		}
	}

	public static <T> Predicate<T> duplicateByKey(final Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> isNull(seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE));

	}

	public static boolean getDuplicates2(final List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1L).map(e -> e.getKey()).collect(Collectors.toList())
				.isEmpty();
	}

	/*
	 * private static Map<String, List<Employee>> getDuplicatesMap(List<Employee>
	 * personList) { return
	 * personList.stream().collect(Collectors.groupingBy(Employee::uniqueAttributes)
	 * ); }
	 */
}
