package com.sk.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Long num = 600851475143L;
		/*
		 * List<Long> primesList = new ArrayList<>(); for (Long i = 0L; i <= num; i++) {
		 * if (i > 1) { int count = 0; for (Long n = 2L; n <= i / 2; n++) { if (i % 2 ==
		 * 0) { count++; break; } } if (count <= 0) { primesList.add(i); } } }
		 */
		// System.out.println(primesList);
		System.out.println(13195 / 5 / 7 / 13 / 29);
		Long factorNumer = num;
		List<Long> primeFactors = new ArrayList<>();
		Long lpf = 0L;
		for (Long i = 2L; i <= num / 2; i++) {
			if (factorNumer % i == 0) {
				primeFactors.add(i);
				factorNumer /= i;
				if (factorNumer == 1) {
					lpf = i;
					break;
				}
			}
		}
		System.out.println(lpf);
	}
}
