package com.sk.exception;

//If class is abstract or interface
public class InstantionExceptionDemo {

	public static void main(String[] args) {
		try {
			AbstractException.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
