package com.sk.datastructures;

import java.util.List;

public class LinearSearch<T> {

	public T findItem(List<T> items, T searchingItem) {
		for (T item : items) {
			if (item.equals(searchingItem)) {
				return item;
			}
		}
		return null;
	}

	public T findItemViaStream(List<T> items, T searchingItem) {
		return items.stream().filter(item -> searchingItem.equals(item)).findAny().orElse(null);
	}
}