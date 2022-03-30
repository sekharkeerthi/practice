package com.sk.interview.amazon;

import java.util.Arrays;

public class ProblemStatement1 {

	public static void main(String[] args) {
		Integer[] resultArr1 = twiceRepeatedNumber(new Integer[] { 10, 12, 10, 11, 13, 17, 16, 15, 11 });
		System.out.println(Arrays.asList(resultArr1));
		Integer[] resultArr2 = twiceRepeatedNumber(new Integer[] { 7, 3, 8, 6, 4, 6, 7, 8, 9, 8, 7 });
		System.out.println(Arrays.asList(resultArr2));
	}

	private static Integer[] twiceRepeatedNumber(Integer[] inputArr) {
		Integer[] resultArr = new Integer[inputArr.length];
		Integer index = 0;
		for (Integer i = 0; i < inputArr.length; i++) {
			Integer count = 0;
			for (Integer j = 0; j < inputArr.length; j++) {
				if (inputArr[i] == inputArr[j]) {
					count++;
				}
			}
			if (count == 2 && !exists(resultArr, inputArr[i])) {
				resultArr[index] = inputArr[i];
				index++;
			}
		}
		return resultArr;
	}

	private static boolean exists(Integer[] resultArr, Integer element) {
		for (Integer e : resultArr) {
			if (e == element)
				return true;
		}
		return false;
	}

}
