package com.sk.defult;

class ExceptionHandlerBehavior {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int i = 10 / 0; // LINE A
			System.out.print("after throw -> ");
		} catch (ArithmeticException ae) {
			System.out.print("in catch -> ");
			return;
		} finally {
			System.out.print("in finally -> ");
		}
		System.out.print("after everything");
	}
}