package com.sk.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}

	private void loadItems() {

		Movie movie = new Movie();
		movie.setPrice(1000.00);
		movie.setTitle("Game of Throns");
		movie.setRunTime("2 hours 30 mins");
		items.put("Movie", movie);

		Book book = new Book();
		book.setNumberOfPages(250);
		book.setPrice(300.00);
		book.setTitle("Miracle Morning");
		items.put("Book", book);

	}

	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {

		}
		return item;
	}

}
