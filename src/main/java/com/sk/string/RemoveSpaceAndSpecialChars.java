package com.sk.string;

public class RemoveSpaceAndSpecialChars {

	public static void main(String[] args) {
		String s = "CPS (Sky Show)";
		s = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
	}

}
