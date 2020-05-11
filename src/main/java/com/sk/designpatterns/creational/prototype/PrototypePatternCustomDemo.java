package com.sk.designpatterns.creational.prototype;

public class PrototypePatternCustomDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie1 = (Movie)registry.createItem("Movie");
		System.out.println("Creational Pattern for Proto type");
		
		System.out.println(movie1);
		System.out.println(movie1.getTitle());
		System.out.println(movie1.getPrice());
		System.out.println(movie1.getRunTime());
		
		
		Movie movie2 = (Movie)registry.createItem("Movie");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		movie2.setTitle("Gang of Four");
		
		System.out.println(movie2);
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getPrice());
		System.out.println(movie2.getRunTime());
	}

}
