package com.sk.defult;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int x = 5;

		boolean b1 = true;

		boolean b2 = false;

		if ((x == 4) && !b2)

			System.out.print("1 ");

		System.out.print("2 ");

		if ((b2 = true) && b1)

			System.out.print("3 ");

		Object[] myObjects = {

				new Integer(12),

				new String("foo"),

				new Integer(5),

				new Boolean(true)

		};

		Arrays.sort(myObjects);

		for (int i = 0; i < myObjects.length; i++) {

			System.out.print(myObjects[i].toString());

			System.out.print(" ");

		}

	}

	/*
	 * void checkEx() throws FileNotFoundException { try{ //code that may throw the
	 * FileNotFoundException }catch(FileNotFoundException eFnf){ throw new
	 * FileNotFoundException(); } }
	 */

}