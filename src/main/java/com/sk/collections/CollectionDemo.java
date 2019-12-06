package com.sk.collections;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("1");
		
		System.out.println(al);
		
		/*for(String name : al) {
			System.out.println(name);
		}*/
		
		HashSet<String> hs = new HashSet<>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("5");
		hs.add("6");
		hs.add("1");
		
		System.out.println(hs);
		
	}
}
