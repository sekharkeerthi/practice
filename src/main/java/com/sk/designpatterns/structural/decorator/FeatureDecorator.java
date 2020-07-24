package com.sk.designpatterns.structural.decorator;

public class FeatureDecorator extends TitleDecorator {

	public FeatureDecorator(Title title) {
		super(title);
	}

	@Override
	public String showTitleName() {
		return super.showTitleName() + " " + showType();
	}

	public String showType() {
		return "is Feature";
	}

}
