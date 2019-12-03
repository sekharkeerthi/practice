/**
 * 
 */
package com.sk.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 */
public class TerminalOperationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person(1, "hsdfjkg", 21);
		Person p2 = new Person(2, "hsdfjkg", 15);
		Person p3 = new Person(3, "hsdfjkg", 17);
		Person p4 = new Person(4, "hsdfjkg", 25);
		
		List<Person> ps = new ArrayList<Person>() {{
			add(p1);
			add(p2);
			add(p3);
			add(p4);
		}};
		
		System.out.println(ps.stream().map(p -> p.getAge()).filter(age -> age > 20).max(Comparator.naturalOrder()).get());

	}

}
