/**
 * 
 */
package com.sk.java8;

import java.util.function.Predicate;

/**
 * @author Sekhar Keerthi
 *
 */
public class PredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);  
  
        // Calling Predicate method 
        System.out.println(lesserthan.test(10));  
        
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 10;
        Predicate<String> p3 = p1.and(p2);
        System.out.println(p3.test("Sekhar Keerthi rgfasdgfasd adgasdgasdasd"));
        
	}

}
