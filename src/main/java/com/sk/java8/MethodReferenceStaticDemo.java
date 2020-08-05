package com.sk.java8;

@FunctionalInterface
interface Interf {
	abstract void method(int i);
}

class InterfStatic {
	static void someMethod(int j) {
		System.out.println(j);
	}
}

public class MethodReferenceStaticDemo {

	public static void main(String[] args) {

		Interf interf = InterfStatic::someMethod;
		interf.method(10);
	}

}
