package com.sk.all;

public class FahrenheitToCelsius extends Object {
	public FahrenheitToCelsius(int i) {
	}

	public FahrenheitToCelsius() {
	}

	public static void main(String[] args) {
		float temparature = 40;
		temparature = ((temparature - 32) * 5) / 9;
		System.out.println(temparature);
		temparature = ((temparature * 9) / 5) + 32;
		System.out.println(temparature);

		FahrenheitToCelsius f = new FahrenheitToCelsius();
		System.out.println(f.hashCode());
		System.out.println(Integer.toHexString(f.hashCode()));
		System.out.println(f.toString());
	}
}
