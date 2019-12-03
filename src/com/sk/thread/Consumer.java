package com.sk.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> queue = null;

	Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed Item: " + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
