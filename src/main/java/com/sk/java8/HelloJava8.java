package com.sk.java8;

public class HelloJava8 implements DefaultMethodInterface/* , DefaultMethodInterface2 */ {
	
	public void defaultMethod() {
		System.out.println("I am in Default method in HelloJava8");
	}
	
	public static void main(String[] args) {
		HelloJava8 defMethIn = new HelloJava8();
		defMethIn.defaultMethod();
	}
}