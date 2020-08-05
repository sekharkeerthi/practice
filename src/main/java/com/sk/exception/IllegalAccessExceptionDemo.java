package com.sk.exception;

//If Constructor is private
public class IllegalAccessExceptionDemo {

	public static void main(String[] args) {
		try {
			AbstractException.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
