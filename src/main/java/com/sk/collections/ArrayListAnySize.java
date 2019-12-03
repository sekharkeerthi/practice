package com.sk.collections;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ArrayListAnySize<E> extends ArrayList<E> {
	@Override
	public void add(int index, E element) {
		if (index >= 0 && index <= size()) {
			super.add(index, element);
			return;
		}
		int insertNulls = index - size();
		for (int i = 0; i < insertNulls; i++) {
			super.add(null);
		}
		super.add(element);
	}

	@SuppressWarnings({})
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// ArrayListAnySize<String> as = (ArrayListAnySize<String>)
		// Class.forName("ArrayListAnySize").newInstance();
		ArrayListAnySize<String> a = new ArrayListAnySize<>();
		a.add("zero");
		a.add("one");
		a.add(2, "two");
		a.add(5, "five");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(i + ": " + a.get(i));
		}
	}
}