package com.sk.all;

class ConvertToByte {
	public static void main(String args[]) {
		float a = 200000000.04f;
		float b = 190000000.53f;
		byte c = (byte) a;
		byte d = (byte) b;
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
}
