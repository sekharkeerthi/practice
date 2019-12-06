/**
 * 
 */
package com.sk.all;

/**
 * @author Sekhar Keerthi
 *
 */
public class Employee2 implements Cloneable {
	private int id;
	private String name;

	public Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee2() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Emp Id :" + this.id + "& Name:" + this.name;
	}
}
