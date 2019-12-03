/**
 * 
 */
package com.sk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 */
public class ComparableImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {{
			add("ss");
			add("a");
			add("yss");
		}};

		/*Collections.sort(list);
		System.out.println(list);*/
		
		Comparator<String> com = (String s1, String s2) -> Integer.compare(s2.length() , s1.length());
		Collections.sort(list, com);
		System.out.println(list);
	}

}
