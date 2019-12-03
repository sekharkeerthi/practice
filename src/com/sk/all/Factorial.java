package com.sk.all;

import java.util.Random;

public class Factorial {

	public static void main(String[] args) {

		int num = 157;
		int revNum = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			revNum = revNum * 10 + rem;
			num /= 10;
		}
		System.out.println(revNum);

		int n = 5, fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * n;
		}
		System.out.println(fact);

		int[][] matrix = new int[2][3];
		Random r = new Random();

		for (int a = 0; a < 2; a++)
			for (int b = 0; b < 3; b++)
				matrix[a][b] = (1 + ((int) (r.nextDouble() * (10 - 1))));

		System.out.println("<---------------- Matrix --------------->");
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 3; b++)
				System.out.print(matrix[a][b] + "\t");

			System.out.print("\n");
		}

		int[][] transposeMatrix = new int[3][2];

		for (int a = 0; a < 2; a++)
			for (int b = 0; b < 3; b++)
				transposeMatrix[b][a] = matrix[a][b];

		System.out.println("<---------------- Transpose Matrix --------------->");
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 2; b++)
				System.out.print(transposeMatrix[a][b] + "\t");

			System.out.print("\n");
		}
		int sum = 0;
		int[][] mul = new int[2][2];
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				for (int c = 0; c < 3; c++) {
					sum += matrix[a][c] * transposeMatrix[c][b];
				}
				mul[a][b] = sum;
				sum = 0;
			}
		}

		System.out.println("<---------------- Multiplication of Matrices --------------->");
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++)
				System.out.print(mul[a][b] + "\t");

			System.out.print("\n");
		}
	}
}
