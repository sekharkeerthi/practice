package com.sk.java8;

@FunctionalInterface
interface X {
	abstract int m1();
}

@FunctionalInterface
interface Y {
	abstract int m2();
}

@FunctionalInterface
interface Z {
	abstract AB m1(X x, Y y);
}

@FunctionalInterface
interface AB {
	abstract void m4();
}

public class HigherOrderFunctionsDemo {

	public static void main(String[] args) {

		X x = () -> {
			return 111;
		};
		Y y = () -> {
			return 222;
		};

		Z z = (i, j) -> {
			System.out.println(x.m1() + y.m2());
			AB ab = () -> System.out.println("Something");
			ab.m4();
			return ab;
		};

		System.out.println(z.m1(x, y));
	}

}
