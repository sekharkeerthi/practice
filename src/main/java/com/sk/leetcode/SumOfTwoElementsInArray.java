package com.sk.leetcode;

import java.util.Arrays;

class SumOfTwoElementsInArray {
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = null;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr = new int[2];
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
		}
		return arr;
	}
	
	public static int[] twoSum2(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String args[]) {
		int[] arr  = SumOfTwoElementsInArray.twoSum(new int[] { 2, 7, 11, 15 }, 26);
		System.out.println(Arrays.toString(arr));
	}
}