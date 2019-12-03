package com.sk.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sekhark Print Number Series [1, 2, 9, 16, 5, 6, 49, 64, 9, 10, 121,
 *         144, 13, 14, 225]
 */
public class NumberSeries {
	public static void main(String[] args) {
		int num = 15, counter = 0;
		List<Integer> series = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (counter > 1) {
				series.add(i * i);
				if (counter == 3)
					counter = -1;
			} else {
				series.add(i);
			}
			counter++;
		}
		System.out.println(series);
	}
}
