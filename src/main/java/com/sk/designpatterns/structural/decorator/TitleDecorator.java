package com.sk.designpatterns.structural.decorator;

public class TitleDecorator implements Title {

	protected Title title;

	public TitleDecorator(Title title) {
		this.title = title;
	}

	@Override
	public String showTitleName() {
		return this.title.showTitleName();
	}

}
