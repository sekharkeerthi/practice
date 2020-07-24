package com.sk.hackerrank;

public class JumpingOnClouds {

	public static void main(String[] args) {
		String s = "0010010";
		int num_of_jumps = 0;
		int occurance = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0')
				occurance++;
			if (s.charAt(i) == '1')
				occurance--;
			if (occurance % 2 == 0) {
				num_of_jumps++;
			} else if (s.charAt(i) == '1'){
				occurance = 0;
			}
				
		}
		System.out.println(num_of_jumps);
	}

}
