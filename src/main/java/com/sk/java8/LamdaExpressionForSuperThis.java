package com.sk.java8;

@FunctionalInterface
interface SuperTihsIntr {
	abstract int method();
}

class SuperTihsIntrParent {
	int a = 111;
}

class SuperTihsIntrChild extends SuperTihsIntrParent {
	int a = 222;
	public int test() {
		int a = 333;
		SuperTihsIntr superTihsIntr = () -> {
			System.out.println("lamda expression");
			return super.a;
			//return this.a;
			//return a;
		};
		return superTihsIntr.method();
	}
}

public class LamdaExpressionForSuperThis {

	public static void main(String[] args) {
		SuperTihsIntrChild sperTihsIntrChild = new SuperTihsIntrChild();
		System.out.println(sperTihsIntrChild.test());
	}

}
