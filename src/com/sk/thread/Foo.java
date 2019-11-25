package com.sk.thread;

class Foo extends Thread {

	public Foo() {

	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Finished");
	}

	public void first(Runnable printFirst) throws InterruptedException {

		System.out.println("First");
		printFirst.run();
	}

	public void second(Runnable printSecond) throws InterruptedException {

		System.out.println("Second");
		printSecond.run();
	}

	public void third(Runnable printThird) throws InterruptedException {

		System.out.println("Third");
		printThird.run();
	}

	public static void main(String[] args) throws InterruptedException {
		Foo t1 = new Foo();
		t1.setPriority(3);
		Foo t2 = new Foo();
		t2.setPriority(2);
		Foo t3 = new Foo();
		t3.setPriority(1);
		t1.first(t1);
		t2.second(t2);
		t3.third(t3);
		/*t1.start();
		t2.start();
		t3.start();*/
	}
}