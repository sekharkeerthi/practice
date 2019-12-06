package com.sk.interview;

public class InterviewADP {
	public static void main(String[] args) {
		C c = new C();
		C b = new B();
		System.out.println(b.i);
		System.out.println(c.i);
		System.out.println(new B().i);
		System.out.println(new C().i);
		c.printMethod();
		b.printMethod();
	}
}

class C {
	public String i = "5";

	public void printMethod() {
		System.out.println("C Method");
	}
}

class B extends C {
	public int i = 10;

	@Override
	public void printMethod() {
		System.out.println("B Mehtod");
	}
}
