package com.sk.collections;

public class Customer {
	private Integer id;
	private String firstName;
	private String laastName;

	public Customer(Integer id, String firstName, String laastName) {
		this.id = id;
		this.firstName = firstName;
		this.laastName = laastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLaastName() {
		return laastName;
	}

	public void setLaastName(String laastName) {
		this.laastName = laastName;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", First Name: " + this.firstName + ", Last Name: " + this.laastName;
	}
	
}
