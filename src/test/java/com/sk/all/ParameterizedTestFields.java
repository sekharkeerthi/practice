package com.sk.all;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {

	// fields used together with @Parameter must be public
	/*
	 * @Parameter(0) public int m1;
	 * 
	 * @Parameter(1) public int m2;
	 * 
	 * @Parameter(2) public int result;
	 */
	
	 // fields used can be private, no need to be public
    private int m1;
    private int m2;
    private int result;
    public ParameterizedTestFields(int m1, int m2, int result) {
        this.m1 = m1;
        this.m2 = m2;
        this.result = result;
    }

	// creates the test data
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiplyException() {
		MyClass tester = new MyClass();
		assertEquals("Result", result, tester.multiply(m1, m2));
	}

	// class to be tested
	class MyClass {
		public int multiply(int i, int j) {
			return i * j;
		}
	}

}