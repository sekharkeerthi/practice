package com.sk.reflection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

// Singleton class 
class Singleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1217744784165618951L;
	// public instance initialized when loading the class
	public static Singleton instance = null;

	private Singleton() {
		// private constructor
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}
}

public class Singleton_Reflection {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());

		try {
			Singleton instance3 = Singleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("d://file.txt"));
			out.writeObject(instance3);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("d://file.txt"));

			Singleton instance4 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance3.hashCode());
			System.out.println("instance2 hashCode:- " + instance4.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}