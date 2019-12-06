package com.sk.all;

public class StaticBlock {
	private static int i;
	static {
		i = 10;
		System.out.println("Static Block");
	}

	public static void main(String args[]) {
		i = i++;
		System.out.println("Main Method : " + i);
	}
}