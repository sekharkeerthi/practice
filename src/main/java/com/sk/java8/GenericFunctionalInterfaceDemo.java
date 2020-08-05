package com.sk.java8;

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		GenericFunctionalInterface<Integer> integer = (Integer t) -> {
			System.out.println(t);
			return 537;
		};
		
		System.out.println(integer.someMethod(345));
		
		GenericFunctionalInterface<String> string = (String t) -> {
			System.out.println(t);
			return "Keerthi";
		};
		
		System.out.println(string.someMethod("Sekhar"));
	}
}

@FunctionalInterface
interface GenericFunctionalInterface<T> {
	abstract T someMethod(T t); 
}
