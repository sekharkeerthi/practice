/**
 * 
 */
package com.sk.thread;

/**
 * @author Sekhar Keerthi
 *
 */
public class Thread2 implements Runnable {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t =new Thread(new Thread2());
		t.start();
		System.out.println("end");

	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("run");
		throw new RuntimeException("pro");
		
	}

}
