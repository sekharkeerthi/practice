package com.sk.java8;

@FunctionalInterface
interface InterfaceInst {
	abstract void method();
	static void m1() {
		System.out.println("jdfhlaskd");
	}
}

class InstanceClass {

	void someMethod() {
		System.out.println("InstanceClass - someMethod");
	}
}

public class MethodReferenceInstanceDemo {

	public static void main(String[] args) {
		InstanceClass instanceClass = new InstanceClass();
		InterfaceInst interfaceInst = instanceClass::someMethod;
		interfaceInst.method();
		
		interfaceInst = new InstanceClass()::someMethod;
		interfaceInst.method();
		
		InterfaceInst.m1();
	}

}

