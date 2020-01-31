package com.sk.interview.everbridge;

import java.util.*;

class GrowingSnake {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for Growing Snake: ");
		int number = sc.nextInt();

		int array[][] = new int[number][number];
		int element = 1, columnIndex1 = 0, columnIndex2 = number - 1, rowIndex1 = 0, rowIndex2 = number - 1;

		/* loop over the number of elements i.e  number * number = number^2*/
		while (element <= number * number) {
			for (int i = columnIndex1; i <= columnIndex2; i++) {
				array[rowIndex1][i] = element++;
			}

			for (int j = rowIndex1 + 1; j <= rowIndex2; j++) {
				array[j][columnIndex2] = element++;
			}

			for (int i = columnIndex2 - 1; i >= columnIndex1; i--) {
				array[rowIndex2][i] = element++;
			}

			for (int j = rowIndex2 - 1; j >= rowIndex1 + 1; j--) {
				array[j][columnIndex1] = element++;
			}

			columnIndex1++;
			columnIndex2--;
			rowIndex1++;
			rowIndex2--;
		}

		/* Printing the Growing Snake matrix */
		System.out.println("The Growing Snake Matrix is:");
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}