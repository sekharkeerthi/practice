package com.sk.java8;

public class A1 {
	Integer id;
	String name;
	String desc;

	A1() {

	}

	A1(Integer id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {

		this.desc = desc;
	}

	@Override
	public String toString() {

		return "Id :" + this.id + " & Name: " + this.name + " & Desc: " + this.desc;
	}

	public static void main(String[] args) {
	}
}
