package com.sk.java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReferenceToArbitraryObject {

	public static void main(String[] args) {
		String[] array = {"sdkfjlas","eirue","jdfhasdkf"};
		
		Arrays.sort(array, String::compareToIgnoreCase);
		
		Arrays.asList(array).forEach(System.out::println);
		
		Arrays.asList(array).forEach(s -> System.out.println(s));
		
		Arrays.asList(array).forEach((s) -> System.out.println(s));
		
		Arrays.asList(array).forEach((String s) -> System.out.println(s));
		
	}

}
