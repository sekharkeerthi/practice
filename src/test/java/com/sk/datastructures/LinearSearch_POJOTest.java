package com.sk.datastructures;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LinearSearch_POJOTest {

	private List<DemoPOJO> elements;
	private LinearSearch<DemoPOJO> searchPojo;

	@Test
	public void linearSearch_POJO() {
		DemoPOJO found = searchPojo.findItem(elements, new DemoPOJO(1, "Sekh"));
		assertNotNull(found);
		assertTrue(found.equals(new DemoPOJO(1, "Sekh")));
	}

	@Test
	public void linearSearch_Stream_POJO() {
		DemoPOJO found = searchPojo.findItemViaStream(elements, new DemoPOJO(2, "Zheng"));
		assertNotNull(found);
		assertTrue(found.equals(new DemoPOJO(2, "Zheng")));
	}

	@SuppressWarnings("serial")
	@Before
	public void setup() {
		searchPojo = new LinearSearch<>();
		elements = new ArrayList<>() {
			{
				add(new DemoPOJO(1, "Sekh"));
				add(new DemoPOJO(2, "Zheng"));
				add(new DemoPOJO(3, "Alex"));
			}
		};
	}
}
