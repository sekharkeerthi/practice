package com.sk.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner strJoiner = new StringJoiner("");
		strJoiner.add("Buggy").add("Bread");
		System.out.println(strJoiner); // prints Buggy.Bread
	}
}
