package com.sk.regularexpressions;

import org.junit.Assert;
import org.junit.Test;

public class UserNameRegexTest {

	@Test
	public void testMinLength() {
		Assert.assertFalse("can't be <2", UserNameRegex.apply("P"));
	}

	@Test
	public void testMaxLength() {
		Assert.assertFalse("Can't be >17", UserNameRegex.apply("Jonathon-Christopher"));
	}

	@Test
	public void testCantEndWith() {
		Assert.assertFalse("can't end with . - _", UserNameRegex.apply("s.g.r_"));
	}

	@Test
	public void testMustStartWith() {
		Assert.assertFalse("Must start with an alphabet", UserNameRegex.apply("23Lucky"));
	}

	@Test
	public void validNames() {
		Assert.assertTrue("Min Length 2", UserNameRegex.apply("Jo"));
		Assert.assertTrue("Max Length 17", UserNameRegex.apply("Peter-Christopher"));
		Assert.assertTrue(". - _ allowed in the middle", UserNameRegex.apply("s.g-h_k.r"));
		Assert.assertTrue("end with numeric", UserNameRegex.apply("Lucky23"));
	}
}
