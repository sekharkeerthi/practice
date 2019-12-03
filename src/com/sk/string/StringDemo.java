package com.sk.string;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "sekhar";
		String s2 = new String("sekhar");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1 == s2.intern());
		String str = "ASFRRulesRR";
		final char[] c = str.toCharArray();
		final List<String> list = new ArrayList<>();
		int tokenStart = 0;
		int currentType = Character.getType(c[tokenStart]);
		for (int pos = tokenStart + 1; pos < c.length; pos++) {
			final int type = Character.getType(c[pos]);
			if (type == currentType) {
				continue;
			}
			if (true && type == Character.LOWERCASE_LETTER && currentType == Character.UPPERCASE_LETTER) {
				final int newTokenStart = pos - 1;
				if (newTokenStart != tokenStart) {
					list.add(new String(c, tokenStart, newTokenStart - tokenStart));
					tokenStart = newTokenStart;
				}
			} else {
				list.add(new String(c, tokenStart, pos - tokenStart));
				tokenStart = pos;
			}
			currentType = type;
		}
		list.add(new String(c, tokenStart, c.length - tokenStart));
		String[] strArr = list.toArray(new String[list.size()]);
		System.out.println(strArr);

		String s3 = "pankaj";
		String s4 = new String("pankaj");
		System.out.println(s3 == (s4 = s4.intern()));
	}

	public void foo(String s) {
		System.out.println("String");
	}

	public void foo(StringBuffer sb) {
		System.out.println("StringBuffer");
	}
}
