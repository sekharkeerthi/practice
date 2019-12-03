/**
 * 
 */
package com.sk.typicalprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 * Print the following series 1, 2, 9, 16, 5, 6, 49, 64, 9, 10
 */
public class NumberSeries {
	
	public static void main(String[] args) {

		int number = 10, counter = 0;
		List<Integer> series = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
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
