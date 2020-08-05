package com.sk.java8;

interface I1 {
	void m1();

	default void defaultMethodInIt() {
		System.out.println("I1 - defaultMethodInIt()");
	}
	
	default void defaultMethod() {
		System.out.println("I1 - defaultMethod()");
	}
	
	default void defaultMethodParam(int x) {
		System.out.println("I1 - defaultMethodParam()");
	}
}

class InterfaceImpl implements I1 {

	@Override
	public void m1() {
		System.out.println("InterfaceImpl - m1()");

	}

	@Override
	public void defaultMethod() {
		System.out.println("InterfaceImpl - defaultMethod()");
	}
}

public class DefaulInterfaceDemo {

	public static void main(String[] args) {
		I1 i1 = new InterfaceImpl();
		i1.m1();
		i1.defaultMethodInIt();
		i1.defaultMethod();

	}

}
