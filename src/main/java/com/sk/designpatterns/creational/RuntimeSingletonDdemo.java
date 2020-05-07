package com.sk.designpatterns.creational;

public class RuntimeSingletonDdemo {

	public static void main(String[] args) {
		Runtime runtime1 = Runtime.getRuntime();
		runtime1.gc();
		System.out.println(runtime1);
		Runtime runtime2 = Runtime.getRuntime();
		System.out.println(runtime2);
		System.out.println(runtime1 == runtime2);
	}

}
