package com.sk.designpatterns.builder;

public class BuilderTitleDemo {

	public static void main(String[] args) {
		// Title.Builder builder = new Title.Builder();
		Title title = Title.builder().currentTitle("American Dad").episodes("25").tvdHierachy("Season").build();
		System.out.println(title);

	}
}
