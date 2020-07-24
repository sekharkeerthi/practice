package com.sk.designpatterns.structural.decorator;

public class SeasonDecorator extends TitleDecorator {

	public SeasonDecorator(Title title) {
		super(title);
	}

	@Override
	public String showTitleName() {
		return super.showTitleName() + " " + showTypeWithEpisodes();
	}

	public String showTypeWithEpisodes() {
		return "is a Season having Episodes " + episodes();
	}

	public Integer episodes() {
		return 10;
	}

}
