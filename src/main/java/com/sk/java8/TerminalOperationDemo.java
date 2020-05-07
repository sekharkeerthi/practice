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
		
		System.out.println("-----------------------------");
		byte myByte = 'a';
		char mychar ='a';
		double myDouble = 'a';
		long myLong = 'a';
		short myShort = 'a';
		float myFloat= 'a';
		int myInt = 'a';
		
		
		System.out.println(myByte);
		System.out.println(mychar);
		System.out.println(myDouble);
		System.out.println(myLong);
		System.out.println(myShort);
		System.out.println(myFloat);
		System.out.println(myInt);		
		
		boolean flag = true;
		int s;
		if(flag) {
			s = 37;
		} else {
			s = 537;
		}
		
		System.out.println(s);
		
		
		boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);
	}

}
