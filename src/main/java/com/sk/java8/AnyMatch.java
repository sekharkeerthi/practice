package com.sk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class AnyMatch {

	public static void main(String[] args) {
		List<A1> list = new ArrayList<A1>() {{
			add(new A1(1, "SK", "Dev"));
			add(new A1(1, "S", "BA"));
			add(new A1(1, "K", "QA"));
		}};

		A1 a = new A1(1, "V", "BA");
		
		boolean match = list.stream().anyMatch(a1 -> a1.getName().equals(a.getName()));
		System.out.println(match);
		
		
		list.forEach(a1 -> System.out.println(a1));
		
		Spliterator<A1> spit = list.spliterator();
		spit.forEachRemaining(a1 -> System.out.println(a1));
	}

}
