package com.sk.java8;

public class StaticMethodInterfaceDemo {

	public static void main(String[] args) {
		StaticInterface si = new StaticInterface() {
			@Override
			public void defaultMethod() {
				StaticInterface.super.defaultMethod();
			}

			@Override
			public void abstractMehtod() {
				System.out.println("StaticInterface - abstractMehtod");
				defaultMethod();
			}
		};
		StaticInterface.staticMethod();
		si.defaultMethod();
		si.abstractMehtod();
	}

}

interface StaticInterface {
	static void staticMethod() {
		System.out.println("StaticInterface - staticMethod");
	}
	default void defaultMethod() {
		System.out.println("StaticInterface - defaultMethod");
	}
	abstract void abstractMehtod();
}

class StaticInterfaceImpl implements StaticInterface {

	@Override
	public void abstractMehtod() {
		System.out.println("StaticInterfaceImpl - abstractMehtod");
	}
	
	public /* static */ void staticMethod() {
		
	}
	
}