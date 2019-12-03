package com.sk.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			list.add(3);
		}

		System.out.println("list:" + list);
	}
}
