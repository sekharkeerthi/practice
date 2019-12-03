/**
 * 
 */
package com.sk.typicalprograms;

/**
 * @author Sekhar Keerthi
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int length = String.valueOf(num).length();
		int actualNum = num;
		int sum = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += Math.pow(rem, length);
		}

		if (actualNum == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
