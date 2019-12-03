package com.sk.exception;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class UnsupportedOperationExceptionExampleCollection {
	private final static int TOTAL_ELEMS = 10;
	private final static Random random = new Random();

	public static void main(String[] args) {
		Collection integers = new HashSet(TOTAL_ELEMS);

		// Fill the collection with some random values.
		for (int i = 0; i < TOTAL_ELEMS; ++i)
			integers.add(random.nextInt());

		// Retrieve an unmodifiable view of the collection.
		Collection unmodifiableCollection = Collections.unmodifiableCollection(integers);

		// This statement throws an UnsupportedOperationException.
		unmodifiableCollection.add(random.nextInt());
	}
}