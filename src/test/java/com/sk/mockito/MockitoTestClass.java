package com.sk.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestClass {

	@Mock
	List<String> mockedList;

	@Spy
	List<String> spiedList = new ArrayList<String>();

	/*
	 * @Before public void init() { MockitoAnnotations.initMocks(this); }
	 */

	@Test
	public void whenNotUseMockAnnotation_thenCorrect() {

		@SuppressWarnings("unchecked")
		List<String> mockList = mock(ArrayList.class);

		mockList.add("one");
		mockList.add("two");
		verify(mockList).add("two");
		assertEquals(0, mockList.size());

		when(mockList.size()).thenReturn(100);
		assertEquals(100, mockList.size());
	}

	@Test
	public void whenNotUseSpyAnnotation_thenCorrect() {
		List<String> spyList = spy(new ArrayList<String>());

		spyList.add("one");
		spyList.add("two");

		verify(spyList).add("one");
		verify(spyList).add("two");

		assertEquals(2, spyList.size());

		doReturn(100).when(spyList).size();
		when(spyList.size()).thenReturn(100);
		assertEquals(100, spyList.size());
	}

	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
		mockedList.add("one");
		verify(mockedList).add("one");
		assertEquals(0, mockedList.size());

		when(mockedList.size()).thenReturn(100);
		assertEquals(100, mockedList.size());
	}

	@Test
	public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly() {
		spiedList.add("one");
		spiedList.add("two");

		verify(spiedList).add("one");
		verify(spiedList).add("two");

		assertEquals(2, spiedList.size());

		doReturn(100).when(spiedList).size();
		assertEquals(100, spiedList.size());
	}

}
