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
		
		System.out.println(hash(e1) & (15));
		
		Map<Emp, Integer> map = new HashMap<>();

		map.put(e1, 1);
		System.out.println(hash(e1) & (15));
		map.put(e2, 1);
		System.out.println(hash(e2) & (15));
		map.put(null, 2);
		map.put(null, 3);
		
		System.out.println(map.get(null));
		
		Map<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, null);
		map2.put(2, null);
		
		System.out.println(map2);
	}
	
	static final int hash(Object key) {
        int h = key.hashCode();
        return (key == null) ? 0 : (h) ^ (h >>> 16);
    }

}
