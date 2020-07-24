package com.sk.hackerrank;

public class CountingValleys {

	public static void main(String[] args) {
		String s = "UDDDUDUUDUDDDUDUU";
		int level = 0, num_valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U')
				level++;
			else if (s.charAt(i) == 'D')
				level--;
			if (level == 0 && s.charAt(i) == 'U')
				num_valleys++;
		}
		System.out.println(num_valleys);
	}
}
