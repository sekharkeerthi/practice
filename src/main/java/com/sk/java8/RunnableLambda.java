package com.sk.java8;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Hello :" + Thread.currentThread().getName());
				}
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
		//thread.join();

		Runnable runnable2 = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello :" + Thread.currentThread().getName());
			}
		};

		Thread thread1 = new Thread(runnable2);
		thread1.start();
		//thread1.join();

		Runnable runnable3 = () -> System.out.println("Hello :" + Thread.currentThread().getName());

		Thread thread2 = new Thread(runnable3);
		thread2.start();
		//thread2.join();
	}
}
