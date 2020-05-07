package com.sk.designpatterns.prototype;

public abstract class Item implements Cloneable {
	private String title;
	private Double price;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	

}
