package com.sk.all;

class Foreach {
	public static void main(String args[]) {
		int[] marks = { 125, 132, 587, 126, 398, 96 };
		maximum(marks);
	}

	public static void maximum(int[] marks) {
		int maxSoFar = marks[0];
		// for each loop
		for (int num : marks) {
			if (num > maxSoFar) {
				maxSoFar = num;
			}
		}
		System.out.println(" the highest value of marks is : " + maxSoFar);
	}
}
