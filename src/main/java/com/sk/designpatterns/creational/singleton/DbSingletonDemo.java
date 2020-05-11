package com.sk.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class DbSingletonDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		DbSingleton dbSingleton1 = DbSingleton.getInstance();

		DbSingleton dbSingleton2 = DbSingleton.getInstance();

		System.out.println(dbSingleton1.equals(dbSingleton2));

		DbSingleton dbSingleton = null; // (DbSingleton)
										// Class.forName("com.sk.designpatterns.creational.DbSingletonDemo").newInstance();

		try {
			Constructor[] constructors = DbSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				dbSingleton = (DbSingleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
