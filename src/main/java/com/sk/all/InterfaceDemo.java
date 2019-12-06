/**
 * 
 */
package com.sk.all;

/**
 * @author Sekhar Keerthi
 *
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		new DefultInterface() {
		}.test();
	}
}

interface DefultInterface {
	default void test() {
		System.out.println("testing");
	}

}
