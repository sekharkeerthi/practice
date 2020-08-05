package com.sk.java8;

import java.util.Optional;

public class Optionaldemo {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "e";
		s[1] = "s";
		//System.out.println(s[2]);

		Optional<String> o = Optional.ofNullable(s[2]);
		System.out.println(o);
		System.out.println(o.isPresent());
		
		System.out.println(Optional.of(s[0]).get());
	}

}
