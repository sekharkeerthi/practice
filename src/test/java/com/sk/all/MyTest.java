package com.sk.all;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTest {

	@Test
	public void test() {
		log.debug("MyTest test() started");
		//fail("Not yet implemented");
		assertTrue("Success", true);
		assertFalse("Fail", false);
		assertEquals("Equal", 5, 5);
		assertEquals("Equals by delta", 7.92, 7.99, 0.5);
		assertNull("It is null", null);
		assertNotNull("It is not null", 3);
		assertArrayEquals("Equal", new int[] {1,2}, new int[] {1,2});
		String a = "xyz";
		String b = "xyz";
		assertSame(a, b);
		String c = new String("xyz");
		assertNotSame(b, c);
		Assume.assumeTrue(System.getProperty("os.name").contains("Linux"));
	}

}
