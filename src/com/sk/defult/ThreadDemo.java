/**
 * 
 */
package com.sk.defult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		
		Thread th1 = new Thread(new ThreadTwiceExample(), "th1");
		th1.start();
		th1.start();
	}

}

class ThreadTwiceExample implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is executing.");
	}
}
