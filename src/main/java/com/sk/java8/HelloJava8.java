package com.sk.java8;

public class HelloJava8 implements DefaultMethodInterface/* , DefaultMethodInterface2 */ {
	public static void main(String[] args) {
		DefaultMethodInterface defMethIn = new HelloJava8();
		defMethIn.defaultMethod();
	}
}