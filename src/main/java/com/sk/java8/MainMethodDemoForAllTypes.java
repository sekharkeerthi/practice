package com.sk.java8;

public class MainMethodDemoForAllTypes {

	public static void main(String[] args) {
		System.out.println("MainMethodDemoForAllTypes main()");
		A.main(args);
		B.main(args);
		C.main(args);
		I.main(args);
	}

}

class A {
	public static void main(String[] args) {
		System.out.println("A main()");
	}
}

abstract class B {
	public static void main(String[] args) {
		System.out.println("B main()");
	}
}

enum C {
	;
	public static void main(String[] args) {
		System.out.println("C main()");
	}
}

interface I {
	public static void main(String[] args) {
		System.out.println("I main()");
	}
}