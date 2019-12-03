package com.sk.collections;

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Test");
		r.run();

		I1 i1 = (i, s) -> System.out.println(i + " : " + s);
		i1.method(1, "dlk;");
	}
}

interface I1 {
	void method(int i, String s);
}