package com.sk.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Martin", 27);
		Map<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(emp1, "Verified");
		emp1.setName("John");
		System.out.println(hm.get(emp1));

		HashMap<Integer, String> hmm = new HashMap<>();
		hmm.put(null, "Z");

		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "A");

		String s = "Sachin";
		String s2 = "Sachin";
		System.out.println(s.equals(s2));// Sachin  
		System.out.println(s == s2);

		Set<Integer> set = new HashSet<Integer>() {
			{
				add(null);
				add(null);
			}
		};

		System.out.println(set);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
			{
				put(1, 1);
				put(1, 1);
			}
		};

		System.out.println(map);
	}
}