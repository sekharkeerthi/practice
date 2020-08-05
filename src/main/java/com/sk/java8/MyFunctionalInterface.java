/**
 * 
 */
package com.sk.java8;

/**
 * @author Sekhar Keerthi
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {

	/* abstract */ void someMethod();

	// abstract void someMethod1();

	default void defaultMethod1() {
		System.out.println("MyFunctionalInterface-defaultMethod1");
	}

	default void defaultMethod2() {
		System.out.println("MyFunctionalInterface-defaultMethod2");
	}

	static void staticMethod1() {
		System.out.println("MyFunctionalInterface-staticMethod1");
	}

	static void staticMethod2() {
		System.out.println("MyFunctionalInterface-staticMethod2");
	}

	/* abstract */ boolean equals(Object object);

	String toString();

	int hashCode();
}
