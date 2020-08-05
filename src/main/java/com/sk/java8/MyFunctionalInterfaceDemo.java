package com.sk.java8;

public class MyFunctionalInterfaceDemo {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterfaceImpl();
		myFunctionalInterface.someMethod();
		myFunctionalInterface.defaultMethod1();
		myFunctionalInterface.defaultMethod2();
		MyFunctionalInterface.staticMethod1();
		MyFunctionalInterface.staticMethod2();

		MyFunctionalInterface myFunctionalInterface2 = new MyFunctionalInterface() {
			@Override
			public void someMethod() {
				System.out.println("MyFunctionalInterface anonymous - someMethod()");
			}
		};

		myFunctionalInterface2.someMethod();

		MyFunctionalInterface myFunctionalInterface3 = () -> System.out
				.println("MyFunctionalInterface lamda - someMethod()");
		myFunctionalInterface3.someMethod();

		MyFunctionalInterface myFunctionalInterface4 = () -> {
			System.out.println("MyFunctionalInterface lamda2 - someMethod()");
		};
		myFunctionalInterface4.someMethod();

		MyFunctionalInterface myFunctionalInterfaceImpl = new MyFunctionalInterfaceImpl();
		myFunctionalInterfaceImpl.someMethod();
		System.out.println(myFunctionalInterfaceImpl.toString());
		System.out.println(myFunctionalInterfaceImpl.hashCode());

		FunctionalDemo2 functionalDemo2 = (int x) -> System.out.println(x);
		functionalDemo2.someMethod(100);
		functionalDemo2 = (x) -> System.out.println(x);
		functionalDemo2.someMethod(110);
		functionalDemo2 = x -> System.out.println(x);
		functionalDemo2.someMethod(120);

		FunctionalDemo3 functionalDemo3 = (int x, int y) -> System.out.println(x + y);
		functionalDemo3.someMethod(100, 100);
		functionalDemo3 = (x, y) -> System.out.println(x + y);
		functionalDemo3.someMethod(200, 100);
		show(functionalDemo3);
		show((x, y) -> System.out.println(x + y));
	}
	
	static void show(FunctionalDemo3 functionalDemo3) {
		functionalDemo3.someMethod(122, 213);
	}
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public void someMethod() {
		System.out.println("MyFunctionalInterfaceImpl - someMethod()");
	}

}

interface FunctionalDemo2 {
	void someMethod(int x);
}

interface FunctionalDemo3 {
	void someMethod(int x, int y);
}
