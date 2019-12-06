package com.sk.string;

public class StringFormatter {
	public static void main(String[] args) {
		String reversWord = reverseWord("I am Sekhar Keerthi");
		System.out.println(reversWord);
		String reversWord2 = reverse("I am Sekhar Keerthi");
		System.out.println(reversWord2);
	}

	public static String reverseWord(String str) {
		String[] strArray = str.split("\\s");
		String reversWord = "";
		for (String s : strArray) {
			StringBuilder sb = new StringBuilder(s);
			reversWord = reversWord + sb.reverse().toString() + " ";
		}
		return reversWord;
	}

	public static String reverse(String str) {
		String[] strArray = str.split("\\s");
		String resverseWord = "";
		for (String s : strArray) {
			String rev = "";
			for (int i = s.toCharArray().length - 1; i >= 0; i--) {
				rev += s.charAt(i);
			}
			resverseWord += rev + " ";
		}
		return resverseWord;
	}
}
