package com.sk.all;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationDemo {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		// Different ways of creating an object
		ObjectDemo od1 = new ObjectDemo();
		System.out.println(od1);
		ObjectDemo od2 = (ObjectDemo) Class.forName("com.sk.all.ObjectDemo").newInstance();
		Constructor<ObjectDemo> constructor = ObjectDemo.class.getConstructor();
		System.out.println(od2);
		ObjectDemo od3 = constructor.newInstance();
		System.out.println(od3);
		ObjectDemo od4 = (ObjectDemo) od1.clone();
		System.out.println(od4);

	}

}

class ObjectDemo implements Serializable, Cloneable {
	private static final long serialVersionUID = -4687458256788316491L;

	public ObjectDemo() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
}
