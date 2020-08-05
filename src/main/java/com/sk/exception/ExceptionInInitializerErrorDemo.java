package com.sk.exception;

public class ExceptionInInitializerErrorDemo {
	private static String message = null;
	private static String subMessage = null;

	public ExceptionInInitializerErrorDemo(String message) {
		ExceptionInInitializerErrorDemo.message = message;
    }

	static {
		/* Store the first 10 characters of the input message. */
		subMessage = message.substring(0, 10);
	}

	public String getSubMessage() {
		return subMessage;
	}

	public static void main(String[] args) {
		ExceptionInInitializerErrorDemo exampleClass = new ExceptionInInitializerErrorDemo("Test");
        System.out.println(exampleClass.getSubMessage());
	}

}
