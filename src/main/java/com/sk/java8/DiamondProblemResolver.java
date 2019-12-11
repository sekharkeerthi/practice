/**
 * 
 */
package com.sk.java8;

/**
 * @author sekha
 *
 */
public class DiamondProblemResolver implements DiamondProblem2, DiamondProblem1 {

	public static void main(String[] args) {
		DiamondProblemResolver dpr = new DiamondProblemResolver();
		dpr.diamond();
	}

	@Override
	public void diamond() {
		DiamondProblem2.super.diamond();
	}

}
