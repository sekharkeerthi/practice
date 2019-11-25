package com.sk.thread;

/**
 * @author Sekhar Keerthi
 * 
 *         Printing Odd Even Threads
 */
public class PrintOddEvenThread {
	boolean odd = false;
	int count = 1;
	int MAX = 10;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		PrintOddEvenThread t = new PrintOddEvenThread();

		Thread odd = new Thread(() -> {
			t.printOdd();
		});

		Thread even = new Thread(() -> {
			t.printEven();
		});

		odd.start();
		even.start();

	}

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking odd loop");
				while (!odd) {
					try {
						System.out.println("Odd waiting : " + count);
						wait();
						System.out.println("Notified odd :" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void printEven() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");
				while (odd) {
					try {
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Notified even:" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count);
				count++;
				odd = true;
				notify();
			}
		}
	}
}
