package com.sk.interview;

public class FirstNonRepeatingCharacter {

	static int numberOfChars = 0;
	static char count[] = null;

	public static void main(String[] args) {

		String str = "fkeertthisekhar";
		numberOfChars = str.length();
		count = new char[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		System.out.println(count['1'] == 1);

		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		//second approach
		index = -1;
		for (int k = 0; k < str.length(); k++) {
			int counter = 1;
			for (int l = k + 1; l < str.length(); l++) {
				if (str.charAt(k) == str.charAt(l)) {
					counter++;
				}
			}
			if (counter == 1) {
				index = i;
				break;
			}
		}

		System.out.println(index);
	}

}
