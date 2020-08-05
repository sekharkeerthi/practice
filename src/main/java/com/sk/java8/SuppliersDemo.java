package com.sk.java8;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SuppliersDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IntSupplier intSupplier = () -> {
			return 537;
		};

		LongSupplier longSupplier = () -> {
			return 537L;
		};

		DoubleSupplier doubleSupplier = () -> {
			return 53.7;
		};

		BooleanSupplier booleanSupplier = () -> {
			System.out.println("Enter some value :");
			int value = scanner.nextInt();
			if (value % 2 == 0)
				return true;
			else 
				return false;
		};

		System.out.println(booleanSupplier.getAsBoolean() ? "Prime" : "Not Prime");
		
		Supplier<String> supplier = () -> {
			return "Welcome!!!!";
		};
		
		System.out.println(supplier.get());
	}

}
