package com.sk.thread;

public class ThreadWaitAndNotify {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.start();

		synchronized (calc) {
			try {
				calc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(calc.getSum());
	}

}

class Calc extends Thread {
	private long sum = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++)
				sum += i;
			notifyAll();
		}
	}

	protected long getSum() {
		return sum;
	}

}