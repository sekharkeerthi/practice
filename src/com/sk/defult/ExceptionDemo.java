package com.sk.defult;
public class ExceptionDemo {
	int a = 10;
	int b = 5;

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();

		int c = ed.a + ed.b;
		System.out.println(c);
		ed.subject();
	}

	public void subject() {
		int d = a - b;
		System.out.println(d);
	}
}