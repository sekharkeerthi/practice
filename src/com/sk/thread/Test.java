package com.sk.thread;

class Test extends Thread {
	Thread t = null;

	public Test(Thread thread) {
		this.t = thread;
	}

	public static void main(String args[]) {
		Test t = new Test(new Thread());
		t.start();
		t.start();
	}
}
