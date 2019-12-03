package com.sk.collections;

import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {

	/**
	 * Comparator to sort Resources list or array in order of Salary
	 */
	public static Comparator<Resource> SalaryComparator = new Comparator<Resource>() {

		@Override
		public int compare(Resource e1, Resource e2) {
			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	/**
	 * Comparator to sort Resources list or array in order of Age
	 */
	public static Comparator<Resource> AgeComparator = new Comparator<Resource>() {

		@Override
		public int compare(Resource e1, Resource e2) {
			return e1.getAge() - e2.getAge();
		}
	};

	/**
	 * Comparator to sort Resources list or array in order of Name
	 */
	public static Comparator<Resource> NameComparator = new Comparator<Resource>() {

		@Override
		public int compare(Resource e1, Resource e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public static void main(String[] args) {
		Resource[] r = new Resource[4];
		r[0] = new Resource(10, "Mikey", 25, 10000);
		r[1] = new Resource(20, "Arun", 29, 20000);
		r[2] = new Resource(5, "Lisa", 35, 5000);
		r[3] = new Resource(1, "Pankaj", 32, 50000);

		// default sorting order
		Arrays.sort(r);
		System.out.println(Arrays.toString(r));

		// sort employees array using Comparator by Salary
		Arrays.sort(r, SortingDemo.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n" + Arrays.toString(r));

		// sort employees array using Comparator by Age
		Arrays.sort(r, SortingDemo.AgeComparator);
		System.out.println("Employees list sorted by Age:\n" + Arrays.toString(r));

		// sort employees array using Comparator by Name
		Arrays.sort(r, SortingDemo.NameComparator);
		System.out.println("Employees list sorted by Name:\n" + Arrays.toString(r));

	}

}
