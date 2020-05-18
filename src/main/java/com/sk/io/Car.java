package com.sk.io;

import java.io.*;

public class Car implements Externalizable {
	static int age;
	String name;
	int year;

	public Car() {
		System.out.println("Default Constructor called");
	}

	Car(String n, int y) {
		this.name = n;
		this.year = y;
		Car.age = 10;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(year);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
	}

	public String toString() {
		return ("Name: " + name + "\n" + "Year: " + year + "\n" + "Age: " + age);
	}
}