package com.sk.exception;

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	public static void main(String[] args) throws MyException {
		int i = 10;
		if(i == 10)
			throw new MyException("Value can not be 10");

	}

}
