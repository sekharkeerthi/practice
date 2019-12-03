/**
 * 
 */
package com.sk.java8;

/**
 * @author sekhark
 *
 */
public class Customer {
	private Long id;
	private String name;

	public Customer() {

	}

	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		Customer customer = (Customer) obj;
		return this.id.equals(customer.getId()) && this.name.equalsIgnoreCase(customer.getName());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
