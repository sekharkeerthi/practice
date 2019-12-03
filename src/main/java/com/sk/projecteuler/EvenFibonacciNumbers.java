package com.sk.projecteuler;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		// System.out.println(new EvenFibonacciNumbers().run());
		long f1 = 0, f2 = 0, f3 = 1, n = 4000000;
		long sum = 0;
		System.out.println("Even Fibonacci Numbers ");
		while (f3 < n) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			if (f3 % 2 == 0) {
				sum += f3;
			}
			System.out.println(f3);
		}
		System.out.println(sum);
	}

	/*
	 * public String run() { int sum = 0; for (int x = 0;; x++) { int fib =
	 * fibonacci(x); if (fib > 4000000) break; if (fib % 2 == 0) sum += fib; }
	 * return Integer.toString(sum); }
	 * 
	 * private static int fibonacci(int n) { if (n < 0 || n > 46) throw new
	 * IllegalArgumentException(); int a = 0; int b = 1; for (int i = 0; i < n; i++)
	 * { int c = a + b; a = b; b = c; } return a; }
	 */
}
