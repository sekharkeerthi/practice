/**
 * 
 */
package com.sk.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sekhar Keerthi
 *
 */
public class HashMapImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "sekhar");
		Emp e2 = new Emp(1, "sekhar");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode() == e2.hashCode());
		
		Map<Emp, Integer> map = new HashMap<>();

		map.put(e1, 1);
		map.put(null, 2);
		map.put(null, 3);
		
		System.out.println(map.get(null));
		
		Map<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, null);
		map2.put(2, null);
		
		System.out.println(map2);
	}

}
