package com.sk.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExcuterServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(() -> System.out.println("From Executor"));
		System.out.println("Main method completed");

		es.shutdown();
		System.out.println("es completed");

		ExecutorService es1 = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 15; i++) {
			es1.execute(() -> {
				System.out.println("Thread Name:" + Thread.currentThread());
			});
		}

		es1.shutdown();

		System.out.println("es1 completed");

		ExecutorService es2 = Executors.newScheduledThreadPool(10);
		es2.awaitTermination(1000, TimeUnit.MILLISECONDS);
		for (int i = 0; i < 15; i++) {
			es2.execute(() -> {
				System.out.println("Thread Name:" + Thread.currentThread());
			});
		}

		es2.shutdown();

		System.out.println("es2 completed");

		ExecutorService es3 = Executors.newScheduledThreadPool(10);
		es3.awaitTermination(1000, TimeUnit.MILLISECONDS);

		Future<?> future = es3.submit(() -> {
			System.out.println("Thread Name:" + Thread.currentThread());
		});

		if (future.get() == null)
			System.out.println("Future Excecuter Service completed successfully!!!!!!!");

		es3.shutdown();

		System.out.println("es3 completed");
		
		
		ExecutorService es4 = Executors.newScheduledThreadPool(10);
		es4.awaitTermination(1000, TimeUnit.MILLISECONDS);

		Future<?> futureFromCallable = es4.submit(() -> {
			return "Result";
		});

		if (futureFromCallable.get().equals("Result"))
			System.out.println("Callable Excecuter Service completed successfully!!!!!!!");

		es4.shutdown();

		System.out.println("es4 completed");
		
	}

}
