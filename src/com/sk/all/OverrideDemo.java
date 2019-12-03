package com.sk.all;

import java.io.IOException;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SuperClass {
	public Integer test() throws Exception {
		return null;
	}
}

class SubClass extends SuperClass {
	@Override
	public Integer test() throws IOException {
		return null;
	}
}