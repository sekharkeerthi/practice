package com.sk.all;

public class A extends Thread {
	synchronized void m1() {
		System.out.println("In m1 A");
	}

	synchronized void m2() {
		System.out.println("In m2 A");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		A a1 = new A();
		a.m1();

		SK sk = new SK() {
			@Override
			public void check() {
				System.out.println("I am SK");
			}
		};
		sk.check();
	}

	public static void main(int[] args) {
		A a = new A();
		a.m1();
		A a1 = new A();
		a.m1();

		SK sk = new SK() {
			@Override
			public void check() {
				System.out.println("I am SK");
			}
		};
		sk.check();
	}

	float test(int i) {
		return i;
	}

	long test(long j) {
		return j;
	}

	private class B {

	}
}

interface SK {
	void check();
}
