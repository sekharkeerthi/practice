package com.sk.java8;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		FI fi = FIImpl::fiImpleMethod;

		// is equalto () -> {System.out.println("FIImpl-FIImpleMethod()");}
		fi.fiMethod();

	}

}

@FunctionalInterface
interface FI {
	abstract void fiMethod();
}

class FIImpl extends FIImpl2 {
	public static void fiImpleMethod() {
		System.out.println("FIImpl-FIImpleMethod()");
		FIImpl.fiImpleMethod();
	}
}

interface FI2 {
	static void m1() {

	}
}

class FIImpl2  {
	public static void fiImpleMethod() {
		System.out.println("FIImpl2-FIImpleMethod()");
	}
}